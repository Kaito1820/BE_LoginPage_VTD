package com.be_login.be_login.service.user_service;

import com.be_login.be_login.dto.reponse.UserResponse;
import com.be_login.be_login.dto.request.user_request.UserRequest;
import com.be_login.be_login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponse getUserInfo(UserRequest userRequest){
        return userRepository.findByEmailAndPassword(userRequest.getEmail(), userRequest.getPassword())
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
