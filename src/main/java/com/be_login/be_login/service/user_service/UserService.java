package com.be_login.be_login.service.user_service;

import com.be_login.be_login.dto.reponse.UserResponse;
import com.be_login.be_login.dto.request.user_request.UserRequest;

public interface UserService {
    UserResponse getUserInfo(UserRequest userRequest);
}
