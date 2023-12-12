package com.baltacristiandorin.smartbill.controller;

import com.baltacristiandorin.jooq.public_.tables.pojos.Users;
import com.baltacristiandorin.smartbill.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@Log4j2
@RequestMapping(path = "api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/user/{id}")
    public ResponseEntity<Users> getUser(@PathVariable UUID id) {

        return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
    }

    @GetMapping(path = "/user/name/{name}")
    public ResponseEntity<Users> getUser(@PathVariable String name) {

        return new ResponseEntity<>(userService.getUser(name), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> upsertUser(@RequestBody Users users) {

        userService.upsert(users);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/user/{id}")
    public ResponseEntity<Users> deleteUser(@PathVariable UUID id) {

        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
