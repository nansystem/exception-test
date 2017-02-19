package com.example.error;

public class BusinessException extends ResultMessagesNotificationException{

    @Override
    public String getResultMessages() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
