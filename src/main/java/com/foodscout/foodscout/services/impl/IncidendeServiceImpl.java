package com.foodscout.foodscout.services.impl;

 import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.foodscout.foodscout.model.Incidence;
import com.foodscout.foodscout.model.dto.IncidenceDto;
import com.foodscout.foodscout.services.IncidenceService;

import lombok.Data;

import com.foodscout.foodscout.repository.IncidendeRepository;
import com.foodscout.foodscout.repository.UserRepository;

@Service
public class IncidendeServiceImpl implements IncidenceService{

    @Autowired
    IncidendeRepository incidendeRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public List<Incidence> getAllInicidences() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllInicidences'");
    }

    @Override
    public List<IncidenceDto> getIncidencesByUserName(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidencesByUserName'");
    }

    @Override
    public void storeIncidence(IncidenceDto datos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'storeIncidence'");
    }

    @Override
    public void deleteIncidence(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteIncidence'");
    }

   


}
