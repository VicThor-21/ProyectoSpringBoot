package com.proyecto.spring.protectoracanina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.spring.protectoracanina.entity.HistorialClinico;

public interface HCRepo extends JpaRepository<HistorialClinico, Integer> {

}
