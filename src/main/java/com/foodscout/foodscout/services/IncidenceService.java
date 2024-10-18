package com.foodscout.foodscout.services;

import org.springframework.stereotype.Service;

import com.foodscout.foodscout.model.Incidence;
import com.foodscout.foodscout.model.dto.IncidenceDto;
import java.util.List;

@Service
public interface IncidenceService {

    //como devolvemos un listado de incidencias, con una lista
    List<Incidence> getAllInicidences();
    List<IncidenceDto> getIncidencesByUserName(String username);
 
    void storeIncidence(IncidenceDto datos);
    //la clase q extienda de esta interfaz, va tener que cargar estos metodos q voy a definir.
    void deleteIncidence(Long id);


    
}
