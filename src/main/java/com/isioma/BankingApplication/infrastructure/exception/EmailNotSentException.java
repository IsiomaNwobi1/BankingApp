package com.isioma.BankingApplication.infrastructure.exception;

public class EmailNotSentException extends RuntimeException{

    public EmailNotSentException(String message) {
        super(message);
    }
}
