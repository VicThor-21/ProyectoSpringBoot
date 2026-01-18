package com.proyecto.spring.protectoracanina.service;

import java.util.Date;
import java.util.List;

import com.proyecto.spring.protectoracanina.EstadoAdopcion;
import com.proyecto.spring.protectoracanina.entity.Perro;

public interface PerroService {
	public Perro insertarPerro(String nombre, int edad, String raza, boolean sexo, float peso, EstadoAdopcion estado, Date fechaIngreso);
	public List<Perro> listadoPerros();
	public Perro obtenerPerro(int id);
	public List<Perro>  obtenerPerro(String nombre);
	public List<Perro> filtroPorEstado(EstadoAdopcion estado);
	public void crearPerro(Perro perro);

}
