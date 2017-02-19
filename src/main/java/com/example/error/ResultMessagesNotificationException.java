package com.example.error;

public abstract class ResultMessagesNotificationException extends RuntimeException
{
    private String resultMessages;
    private String message;

    public abstract String getResultMessages();

    public abstract String getMessage();
}
