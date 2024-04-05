package com.isioma.BankingApplication.service;

import com.isioma.BankingApplication.payload.request.LoginRequest;
import com.isioma.BankingApplication.payload.request.UserRequest;
import com.isioma.BankingApplication.payload.response.ApiResponse;
import com.isioma.BankingApplication.payload.response.BankResponse;
import com.isioma.BankingApplication.payload.response.JwtAuthResponse;
import org.springframework.http.ResponseEntity;

public interface AuthService {

    BankResponse registerUser (UserRequest userRequest);

    ResponseEntity<ApiResponse<JwtAuthResponse>> login(LoginRequest loginRequest);
}
