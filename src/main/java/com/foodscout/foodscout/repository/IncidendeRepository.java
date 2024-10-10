package com.foodscout.foodscout.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodscout.foodscout.model.Incidence;
 
@Repository
public interface IncidendeRepository extends JpaRepository<Incidence,Long>{

    


}
