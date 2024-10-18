package com.foodscout.foodscout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodscout.foodscout.model.Historical;

@Repository
public interface HistoricalRepository extends JpaRepository<Historical, Long>{

}
