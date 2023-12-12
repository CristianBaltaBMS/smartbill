package com.baltacristiandorin.smartbill.service;

import com.baltacristiandorin.jooq.public_.tables.pojos.Users;
import com.baltacristiandorin.smartbill.exceptions.SmartBillNotFoundException;
import com.baltacristiandorin.smartbill.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users getUser(UUID uuid) throws SmartBillNotFoundException {

        Users user = userRepository.getUser(uuid);

        if (user != null) {
            return user;
        } else {
            throw new SmartBillNotFoundException("The value for %s is not in the database!".formatted(uuid));
        }
    }

    public Users getUser(String name) throws SmartBillNotFoundException {

        Users user = userRepository.getUser(name);

        if (user != null) {
            return user;
        } else {
            throw new SmartBillNotFoundException("The value for %s is not in the database!".formatted(name));
        }
    }

    public void upsert(Users users) {

        userRepository.upsertUser(users);
    }

    public void deleteUser(UUID uuid) {

        userRepository.deleteUserById(uuid);
    }

    public void deleteUser(String name) {

        userRepository.deleteUserByName(name);
    }
}
