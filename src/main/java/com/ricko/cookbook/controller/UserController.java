package com.ricko.cookbook.controller;

import com.ricko.cookbook.model.account.UserRequest;
import com.ricko.cookbook.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


//@RequestMapping("/users")
@RestController("/users")
@RequiredArgsConstructor
@Log4j2 //todo
public class UserController {

    private final UserService accountService;

    @GetMapping
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("Hello there");
    }

    @PostMapping
    public ResponseEntity<Long> createUser(UserRequest request) {
        Long userId = accountService.createUser(request);
        return ResponseEntity.ok(userId);
    }

}

