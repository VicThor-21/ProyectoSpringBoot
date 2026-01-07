package com.proyecto.spring.protectoracanina.service;

import java.util.List;

import com.proyecto.spring.protectoracanina.entity.Adoptante;

public interface AdoptanteService {
	public Adoptante insertarAdoptante(String nombre, String apellidos, String dni, String telefono, String email);
	public List<Adoptante> listadoAdoptantes();
	public Adoptante obtenerAdoptante(int id);
	public Adoptante obtenerAdoptante(String nombre);
}
