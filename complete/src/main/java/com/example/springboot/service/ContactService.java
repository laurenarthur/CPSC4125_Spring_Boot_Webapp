package com.example.springboot;

import com.example.springboot.Contact;

public class ContactService {
    
    public String postContact (Contact contact){
        System.out.println(contact.getName());
        return "hello";
    }

}