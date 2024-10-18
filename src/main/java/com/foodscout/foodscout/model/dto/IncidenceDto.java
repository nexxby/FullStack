package com.foodscout.foodscout.model.dto;

import com.foodscout.foodscout.model.User;
import com.foodscout.foodscout.model.utils.Scopes;
import com.foodscout.foodscout.model.utils.Priorities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IncidenceDto {
    private String description;
    private Priorities priority;
    private User userCreated;
    private Scopes scopes;
   

}
