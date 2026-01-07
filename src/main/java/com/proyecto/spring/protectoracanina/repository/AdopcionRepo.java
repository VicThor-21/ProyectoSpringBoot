package com.proyecto.spring.protectoracanina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.spring.protectoracanina.entity.Adopcion;

public interface AdopcionRepo extends JpaRepository<Adopcion, Integer> {
	
	

}
