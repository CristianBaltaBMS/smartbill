package com.baltacristiandorin.smartbill.repository;

import com.baltacristiandorin.jooq.public_.tables.daos.UsersDao;
import com.baltacristiandorin.jooq.public_.tables.pojos.Users;
import org.jooq.DSLContext;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

import static com.baltacristiandorin.jooq.public_.tables.Users.USERS;
import static org.jooq.impl.DSL.field;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserRepositoryTest {

    @Mock
    private UsersDao mockUsersDao;

    @Mock
    private DSLContext mockDslContext;

    @InjectMocks
    private UserRepository userRepository;

    @Test
    void testGetUserById() {
        UUID uuid = UUID.randomUUID();
        String name = "name";
        Users user = new Users();
        user.setUserId(uuid);
        user.setUserName(name);

        when(mockUsersDao.findById(uuid)).thenReturn(user);

        Users result = userRepository.getUser(uuid);

        assertEquals(user, result);
        verify(mockUsersDao).findById(uuid);
    }

    @Test
    @Disabled
    void testGetUserByName() {
        UUID id = UUID.randomUUID();
        String name = "name";
        Users user = new Users();
        user.setUserId(id);
        user.setUserName(name);

        when(mockDslContext.selectFrom(USERS)
                .where(USERS.USER_NAME.eq(name))
                .fetchOneInto(Users.class)).thenReturn(user);

        Users result = userRepository.getUser(name);

        assertEquals(user, result);
        verify(mockDslContext).selectFrom(USERS);
    }

    @Test
    @Disabled
    void testUpsertUser() {
        UUID id = UUID.randomUUID();
        String name = "name";
        Users user = new Users();
        user.setUserId(id);
        user.setUserName(name);

        doNothing().when(mockDslContext).insertInto(USERS, USERS.USER_NAME)
                .values(user.getUserName())
                .onConflict(field(USERS.USER_NAME))
                .doNothing().execute();

        assertDoesNotThrow(() -> userRepository.upsertUser(user));

        verify(mockDslContext).insertInto(USERS, USERS.USER_NAME);
    }

    @Test
    void testDeleteUserById() {
        UUID uuid = UUID.randomUUID();

        doNothing().when(mockUsersDao).deleteById(uuid);

        userRepository.deleteUserById(uuid);

        verify(mockUsersDao).deleteById(uuid);
    }

    @Test
    @Disabled
    void testDeleteUserByName() {
        String name = "name";

        doNothing().when(mockDslContext).deleteFrom(USERS)
                .where(USERS.USER_NAME.eq(name))
                .execute();

        userRepository.deleteUserByName(name);

        verify(mockDslContext).deleteFrom(USERS);
    }
}
