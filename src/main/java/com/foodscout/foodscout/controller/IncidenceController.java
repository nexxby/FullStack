package com.foodscout.foodscout.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.foodscout.foodscout.model.dto.IncidenceDto;
import com.foodscout.foodscout.services.IncidenceService;

import jakarta.persistence.Entity;
import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/api")
public class IncidenceController {

    @Autowired
    IncidenceService incidenceService;

    @PostMapping("incidence")
    public ResponseEntity<Entity>addIncidence(@RequestBody IncidenceDto entity) {
        //TODO: process POST request
        
        return new ResponseEntity<Integer>(1, HttpStatus.ACCEPTED);

    }
    

    @PostMapping("/incidence/:id")
    public ResponseEntity<Integer> addIncidenceDetail(@PathParam(value = "id") Integer id){
        try {
            incidenceService.storeIncidence(id);
            return new ResponseEntity<Integer>(1,HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<Integer>(0, HttpStatus.BAD_REQUEST);
        }
    }
    
   

}
