package com.baltacristiandorin.smartbill.service;

import com.baltacristiandorin.jooq.public_.tables.pojos.Users;
import com.baltacristiandorin.smartbill.exceptions.SmartBillNotFoundException;
import com.baltacristiandorin.smartbill.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void getUserByIdTest() {
        UUID uuid = UUID.randomUUID();
        String name = "name";
        Users user = new Users();
        user.setUserId(uuid);
        user.setUserName(name);

        when(userRepository.getUser(uuid)).thenReturn(user);

        Users result = userService.getUser(uuid);

        assertNotNull(result);
        assertEquals(uuid, result.getUserId());
    }

    @Test
    public void getUserByIdNotFoundTest() {
        UUID uuid = UUID.randomUUID();

        when(userRepository.getUser(uuid)).thenReturn(null);

        assertThrows(SmartBillNotFoundException.class, () -> userService.getUser(uuid));
    }

    @Test
    public void getUserByNameTest() {
        UUID id = UUID.randomUUID();
        String name = "name";
        Users user = new Users();
        user.setUserId(id);
        user.setUserName(name);

        when(userRepository.getUser(name)).thenReturn(user);

        Users result = userService.getUser(name);

        assertNotNull(result);
        assertEquals(name, result.getUserName());
    }

    @Test
    public void getUserByNameNotFoundTest() {
        String name = "name";

        when(userRepository.getUser(name)).thenReturn(null);

        assertThrows(SmartBillNotFoundException.class, () -> userService.getUser(name));
    }

    @Test
    public void upsertUserTest() {
        UUID id = UUID.randomUUID();
        String name = "name";
        Users user = new Users();
        user.setUserId(id);
        user.setUserName(name);

        doNothing().when(userRepository).upsertUser(user);

        assertDoesNotThrow(() -> userService.upsert(user));

        verify(userRepository).upsertUser(user);
    }

    @Test
    public void deleteUserByIdTest() {
        UUID uuid = UUID.randomUUID();

        doNothing().when(userRepository).deleteUserById(uuid);

        userService.deleteUser(uuid);

        verify(userRepository).deleteUserById(uuid);
    }

    @Test
    public void deleteUserByNameTest() {
        String name = "name";

        doNothing().when(userRepository).deleteUserByName(name);

        userService.deleteUser(name);

        verify(userRepository).deleteUserByName(name);
    }
}
