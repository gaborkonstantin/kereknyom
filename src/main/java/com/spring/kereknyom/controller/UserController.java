package com.spring.kereknyom.controller;

import com.spring.kereknyom.dto.incoming.UserCreateUpdateCommand;
import com.spring.kereknyom.dto.outgoing.UserInfo;
import com.spring.kereknyom.service.UserService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/users")
@Slf4j
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserInfo> save(@RequestBody UserCreateUpdateCommand command)  {
        log.info("Http request, POST /api/users, body: " + command.toString());
        UserInfo userInfo = userService.save(command);
        return new ResponseEntity<>(userInfo, HttpStatus.CREATED);
    }
}
