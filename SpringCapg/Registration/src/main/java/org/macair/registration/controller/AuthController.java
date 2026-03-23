package org.macair.registration.controller;


import org.macair.registration.model.User;
import org.macair.registration.model.dto.AuthLoginResponse;
import org.macair.registration.model.dto.AuthSignupResponse;
import org.macair.registration.model.dto.DeleteUserRequest;
import org.macair.registration.model.dto.UserResponse;
import org.macair.registration.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")

public class AuthController {

    private final UserService service;

    public AuthController(UserService service) {
        this.service = service;
    }


    @GetMapping("/allusers")
    public ResponseEntity<List<UserResponse>> getAllUsers() {

        List<UserResponse> users = service.getAllUsers();

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(users);
    }

    @PostMapping("/signup")
    public ResponseEntity<AuthSignupResponse> signup(@RequestBody User user){

        AuthSignupResponse res = service.signup(user); //Sending whole object and splitting in service

        if(!res.isSuccess()){
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body(res);
        }

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(res);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthLoginResponse> login(@RequestBody User user){
        AuthLoginResponse res = service.login(user.getUsername(), user.getPassword()); //Sending split data

        if(!res.isSuccess()){
            return ResponseEntity
                    .status(HttpStatus.UNAUTHORIZED)
                    .body(res);
        }

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(res);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<AuthLoginResponse> deleteUser(@RequestBody User user) {
        AuthLoginResponse res = service.deleteUser(user.getUsername(), user.getPassword());

        if(!res.isSuccess()){
            return ResponseEntity
                    .status(HttpStatus.UNAUTHORIZED)
                    .body(res);
        }

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(res);
    }

}
