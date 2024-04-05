package com.isioma.BankingApplication.payload.response;

import com.isioma.BankingApplication.utils.DateUtils;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ApiResponse<T> {

    private String message;
    private T data;
    private String responseTime;

    public ApiResponse(String message, T data) {
        this.message = message;
        this.data = data;
        this.responseTime = DateUtils.dateToString(LocalDateTime.now());
    }

    public ApiResponse(String message) {
        this.message = message;
        this.responseTime = DateUtils.dateToString(LocalDateTime.now());

    }
}
