package com.proyecto.spring.protectoracanina.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.spring.protectoracanina.entity.HistorialClinico;
import com.proyecto.spring.protectoracanina.entity.Perro;


public interface HCRepository extends JpaRepository<HistorialClinico, Integer> {
	
	public List<HistorialClinico> findByPerro(Perro perro);
}
