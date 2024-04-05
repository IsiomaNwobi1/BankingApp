package com.isioma.BankingApplication.domain.entities;


import lombok.*;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorDetails {

    private String message;

    private String debugMessage;

    private HttpStatus status;

    private String dateTime;
}
