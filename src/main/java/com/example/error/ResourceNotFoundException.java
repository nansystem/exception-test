package com.example.error;

public class ResourceNotFoundException extends ResultMessagesNotificationException{
    public ResourceNotFoundException(String message) {

    }

    @Override
    public String getResultMessages() {
        return "リソースなしリザルトメッセージ";
    }

    @Override
    public String getMessage() {
        return "リソースなしメッセージ";
    }
}
