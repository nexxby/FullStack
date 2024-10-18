package com.foodscout.foodscout.model.dto;

import java.time.LocalDateTime;

import com.foodscout.foodscout.model.utils.Roles;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
    private String name;
    private String email;
    private String password;
    private Roles rol;
    private Boolean active;
    private LocalDateTime lastConnection;
}
