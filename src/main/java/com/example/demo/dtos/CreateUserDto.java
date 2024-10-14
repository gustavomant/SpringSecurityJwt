package com.example.demo.dtos;

import com.example.demo.models.RoleName;

public record CreateUserDto (
    String email,
    String password,
    RoleName role
) {}

