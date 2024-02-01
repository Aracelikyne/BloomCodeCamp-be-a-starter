package com.hcc.controllers;

import com.hcc.dtos.AuthCredentialRequest;
import com.hcc.entities.User;
import com.hcc.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RequestMapping ("/api/auth")
public class LoginController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JWTUtil jwtUtil;
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthCredentialRequest authCredentialRequest) throws Exception {
        Authentication authObject;

        try {
            authObject = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                            authCredentialRequest.getUsername(),authCredentialRequest.getPassword()));


        } catch (BadCredentialsException exception){
            throw new Exception("Credentials Invalid");
        }
        return null;
    }
    @GetMapping ("/validate")
    ResponseEntity<?> validate (@RequestParam String token, @AuthenticationPrincipal User user) {
        boolean isValid;
        if (user != null){
            isValid = true;
        } else {
             isValid = false;
        }
        return ResponseEntity.ok(isValid);
    }
}
