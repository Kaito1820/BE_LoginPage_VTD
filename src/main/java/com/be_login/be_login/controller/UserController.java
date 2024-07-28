package com.be_login.be_login.controller;

import com.be_login.be_login.dto.reponse.UserResponse;
import com.be_login.be_login.dto.request.user_request.UserRequest;
import com.be_login.be_login.service.user_service.UserImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class UserController {
    @Autowired
    private UserImpl userService;

    @PostMapping("/login")
    public ResponseEntity<UserResponse> getUserInfo(@RequestBody @Valid UserRequest userRequest){
        return new ResponseEntity<>(userService.getUserInfo(userRequest), HttpStatus.OK);
    }
}
