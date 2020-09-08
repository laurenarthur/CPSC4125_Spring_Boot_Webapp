package com.example.springboot;

public class Contact {
    private String name; // private = restricted access
    private String message;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    // Getter
    public String getMessage() {
        return message;
    }

    // Setter
    public void setMessage(String newMessage) {
        this.message = newMessage;
    }
}