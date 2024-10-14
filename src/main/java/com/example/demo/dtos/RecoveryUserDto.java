package com.example.demo.dtos;

import java.util.List;

import com.example.demo.models.Role;

public record RecoveryUserDto (
    Long id,
    String email,
    List <Role> roles
) {}
