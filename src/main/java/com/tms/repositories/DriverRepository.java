package com.tms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.entities.DriverEntity;

public interface DriverRepository extends JpaRepository<DriverEntity,Integer>{

}
