package com.proyecto.spring.protectoracanina.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.spring.protectoracanina.entity.Perro;

public interface PerroRepo extends JpaRepository<Perro, Integer> {
	public Optional<Perro> findByNombre(String nombre);
}
