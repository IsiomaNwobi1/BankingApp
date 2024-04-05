package com.isioma.BankingApplication.infrastructure.controller;


import com.isioma.BankingApplication.payload.request.LoginRequest;
import com.isioma.BankingApplication.payload.request.UserRequest;
import com.isioma.BankingApplication.payload.response.ApiResponse;
import com.isioma.BankingApplication.payload.response.BankResponse;
import com.isioma.BankingApplication.payload.response.JwtAuthResponse;
import com.isioma.BankingApplication.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@Tag(name = "User Authentication Management APIs")
public class AuthController {

    private final AuthService authService;

    @Operation(
            summary = "Register New User Account",
            description = "Create a new user and assign account number"
    )

    @PostMapping("/register-user")
    public BankResponse createAccount(@Valid @RequestBody UserRequest userRequest) {
        return authService.registerUser(userRequest);
    }

    @PostMapping("/login-user")
    public ResponseEntity<ApiResponse<JwtAuthResponse>> login(@Valid @RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);

    }
}
