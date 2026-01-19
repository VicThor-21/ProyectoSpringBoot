package com.proyecto.spring.protectoracanina.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyecto.spring.protectoracanina.EstadoPerro;
import com.proyecto.spring.protectoracanina.entity.Perro;


public interface PerroRepository extends JpaRepository<Perro, Integer> {
	public List<Perro> findByNombre(@Param("nombre") String nombre);
	public List<Perro> findByEstado(@Param("estado") EstadoPerro estado);
	@Query("SELECT p from Perro p WHERE p.nombre=:nombre AND p.estado=:estado")
	public List<Perro> findByNombreYEstado(@Param("nombre") String nombre,@Param("estado") EstadoPerro estado);
}
