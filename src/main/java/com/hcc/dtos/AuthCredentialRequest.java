package com.hcc.dtos;

import org.springframework.beans.factory.annotation.Autowired;

public class AuthCredentialRequest {
    @Autowired
    private String username;
    @Autowired
    private String password;

public AuthCredentialRequest() {
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }


}
