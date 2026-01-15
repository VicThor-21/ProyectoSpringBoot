package com.proyecto.spring.protectoracanina.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.spring.protectoracanina.entity.Perro;

public interface PerroRepository extends JpaRepository<Perro, Integer> {
	public List<Perro> findByNombre(String nombre);
}
