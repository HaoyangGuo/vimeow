package com.dhguo.vimeowbackend.controller;

import com.dhguo.vimeowbackend.payload.request.LoginRequest;
import com.dhguo.vimeowbackend.payload.request.SignupRequest;
import com.dhguo.vimeowbackend.payload.response.JwtResponse;
import com.dhguo.vimeowbackend.payload.response.MessageResponse;
import com.dhguo.vimeowbackend.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        JwtResponse jwtResponse = authService.authenticateUser(loginRequest);
        return ResponseEntity.ok(jwtResponse);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signupRequest) {
        MessageResponse messageResponse = authService.registerUser(signupRequest);
        return ResponseEntity.ok(messageResponse);
    }
}
