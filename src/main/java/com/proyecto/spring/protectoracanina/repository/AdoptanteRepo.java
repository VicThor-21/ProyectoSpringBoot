package com.proyecto.spring.protectoracanina.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.spring.protectoracanina.entity.Adoptante;


public interface AdoptanteRepo extends JpaRepository<Adoptante, Integer> {
	
	public Optional<Adoptante> findByNombre(String nombre);

}
