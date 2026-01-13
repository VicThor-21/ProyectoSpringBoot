package com.proyecto.spring.protectoracanina.service;

import java.util.Date;
import java.util.List;

import com.proyecto.spring.protectoracanina.entity.Adopcion;
import com.proyecto.spring.protectoracanina.entity.Adoptante;
import com.proyecto.spring.protectoracanina.entity.Perro;

public interface AdopcionService {

	public Adopcion insertarAdopcion(Date fecha, int estado, boolean donacion, Perro perro, Adoptante adoptante);
	public List<Adopcion> listadoAdopciones();
	public Adopcion obtenerAdopcion(int id);
	
}
