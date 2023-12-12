package com.baltacristiandorin.smartbill.service;

import com.baltacristiandorin.jooq.public_.tables.pojos.Users;
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

    public Users getUser(UUID uuid) {

        return userRepository.getUser(uuid);
    }

    public Users getUser(String name) {

        return userRepository.getUser(name);
    }

    public void upsert(Users users) {

        userRepository.upsertUser(users);
    }

    public void deleteUser(UUID uuid) {

        userRepository.deleteUserById(uuid);
    }
}
