package com.baltacristiandorin.smartbill.controller;

import com.baltacristiandorin.jooq.public_.tables.pojos.Users;
import com.baltacristiandorin.smartbill.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.UUID;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void getUserByIdTest() throws Exception {
        UUID id = UUID.randomUUID();
        String name = "name";
        Users user = new Users();
        user.setUserId(id);
        user.setUserName(name);

        when(userService.getUser(id)).thenReturn(user);

        mockMvc.perform(get("/api/v1/users/user/" + id))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));

        verify(userService).getUser(id);
    }

    @Test
    public void getUserByNameTest() throws Exception {
        UUID id = UUID.randomUUID();
        String name = "name";
        Users user = new Users();
        user.setUserId(id);
        user.setUserName(name);

        when(userService.getUser(name)).thenReturn(user);

        mockMvc.perform(get("/api/v1/users/user/name/" + name))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));

        verify(userService).getUser(name);
    }

    @Test
    public void upsertUserTest() throws Exception {
        UUID id = UUID.randomUUID();
        String name = "name";
        Users user = new Users();
        user.setUserId(id);
        user.setUserName(name);

        String userJson = new ObjectMapper().writeValueAsString(user);

        doNothing().when(userService).upsert(any(Users.class));

        mockMvc.perform(post("/api/v1/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson))
                .andExpect(status().isCreated());

        verify(userService).upsert(any(Users.class));
    }

    @Test
    public void deleteUserByIdTest() throws Exception {
        UUID id = UUID.randomUUID();

        doNothing().when(userService).deleteUser(id);

        mockMvc.perform(delete("/api/v1/users/user/" + id))
                .andExpect(status().isOk());

        verify(userService).deleteUser(id);
    }

    @Test
    public void deleteUserByNameTest() throws Exception {
        String name = "name";

        doNothing().when(userService).deleteUser(name);

        mockMvc.perform(delete("/api/v1/users/user/name/" + name))
                .andExpect(status().isOk());

        verify(userService).deleteUser(name);
    }
}
