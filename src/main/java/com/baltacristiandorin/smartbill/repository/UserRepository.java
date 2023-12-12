package com.baltacristiandorin.smartbill.repository;

import com.baltacristiandorin.jooq.public_.tables.daos.UsersDao;
import com.baltacristiandorin.jooq.public_.tables.pojos.Users;
import lombok.extern.log4j.Log4j2;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import static com.baltacristiandorin.jooq.public_.tables.Users.USERS;
import static org.jooq.impl.DSL.field;

@Repository
@Log4j2
public class UserRepository {

    private final UsersDao usersDao;
    private final DSLContext dslContext;

    public UserRepository(DSLContext dslContext) {
        this.usersDao = new UsersDao(dslContext.configuration());
        this.dslContext = dslContext;
    }

    public Users getUser(UUID uuid) {

        return usersDao.findById(uuid);
    }

    public Users getUser(String name) {

        return dslContext.selectFrom(USERS)
                .where(USERS.USER_NAME.eq(name))
                .fetchOneInto(Users.class);
    }

    public void upsertUser(Users users) {

        dslContext.insertInto(USERS, USERS.USER_NAME)
                .values(users.getUserName())
                .onConflict(field(USERS.USER_NAME))
                .doNothing().execute();
    }

    public void deleteUserById(UUID uuid) {

        usersDao.deleteById(uuid);
    }

    public void deleteUserByName(String name) {

        dslContext.deleteFrom(USERS).where(USERS.USER_NAME.eq(name)).execute();
    }
}
