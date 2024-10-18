package com.foodscout.foodscout.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AttachedFileDto {
    private String name;
    private String mimeType;
    private String route;
    private String idIncidence;
}
