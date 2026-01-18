package com.proyecto.spring.protectoracanina.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.proyecto.spring.protectoracanina.entity.Perro;
import com.proyecto.spring.protectoracanina.EstadoAdopcion;


public interface PerroRepository extends JpaRepository<Perro, Integer> {
	public List<Perro> findByNombre(String nombre);
	public List<Perro> findByEstado(@Param("estado") EstadoAdopcion estado);
}
