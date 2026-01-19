package com.proyecto.spring.protectoracanina.service;

import java.util.List;

import com.proyecto.spring.protectoracanina.EstadoPerro;
import com.proyecto.spring.protectoracanina.entity.Perro;

public interface PerroService {
	public List<Perro> listadoPerros();
	public Perro obtenerPerro(int id);
	public List<Perro> filtroPorEstado(EstadoPerro estado);
	public List<Perro>  obtenerPerro(String nombre, EstadoPerro estado);
	public void crearPerro(Perro perro);
	public void eliminarPerro(int id);
}
