package com.example.SpringSecurityApp.SpringApplication.dto;

import lombok.Data;

@Data
public class SignUpDto {
    private String password;
    private String name;
    private String email;
}
