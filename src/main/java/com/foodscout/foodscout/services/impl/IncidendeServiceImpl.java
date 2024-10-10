package com.foodscout.foodscout.services.impl;

 import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodscout.foodscout.model.Incidence;
import com.foodscout.foodscout.model.dto.IncidenceDto;
import com.foodscout.foodscout.services.IncidenceService;
import com.foodscout.foodscout.repository.IncidendeRepository;

@Service
public class IncidendeServiceImpl implements IncidenceService{

    @Autowired
    IncidendeRepository incidendeRepository;

    @Override
    public IncidenceDto getIncidencesDtoById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidencesDtoById'");
    }

    @Override
    public List<IncidenceDto> getIncidencesDtoByUser(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidencesDtoByUser'");
    }

    @Override
    public void storeIncidende(IncidenceDto datos) {
        Incidence incidence = new Incidence();
        incidence.setCategory(datos.getCategory());
        incidence.setDescription(datos.getDescription());
        incidence.setPriority(datos.getPriority());
        incidence.setCreatedAt(LocalDateTime.now());
        incidence.setUserCreated(null);

    }

    @Override
    public void deleteIncidence(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteIncidence'");
    }

    @Override
    public IncidenceDto getIncidencesById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidencesById'");
    }

    @Override
    public List<IncidenceDto> getIncidencesByUserName(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidencesByUserName'");
    }

    @Override
    public boolean storeIncidence(String entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'storeIncidence'");
    }

}
