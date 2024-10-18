package com.foodscout.foodscout.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatDto {
    private String message;
    private String idUser;
    private String idIncidence;
}
