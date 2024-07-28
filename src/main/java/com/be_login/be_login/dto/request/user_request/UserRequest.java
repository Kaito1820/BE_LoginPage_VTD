package com.be_login.be_login.dto.request.user_request;

import jakarta.validation.constraints.Size;

public class UserRequest {
    private String email;
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;

    public UserRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

