package com.foodscout.foodscout.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.foodscout.foodscout.services.IncidenceService;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/api")
public class IncidenceController {

    @Autowired
    IncidenceService incidenceService;
    @PostMapping("/incidence")
    public ResponseEntity<Integer> postMetohName(@RequestBody String entity){
        try {
            incidenceService.storeIncidence(entity);
            return new ResponseEntity<Integer>(1, HttpStatus.BAD_REQUEST)
        } catch (Exception e) {
            return new ResponseEntity<Integer>(0, HttpStatus.BAD_REQUEST);
        }
    }
    
   

}
