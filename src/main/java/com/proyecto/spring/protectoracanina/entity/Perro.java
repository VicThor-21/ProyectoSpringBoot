package com.proyecto.spring.protectoracanina.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="PERRO") // Nombre de la tabla en H2
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Perro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="perro_id")
	private int id;
	@Column(name="nombre")  // El nombre de los campos los crea por defecto en mayuscula
	private String nombre;
	@Column(name="edad")
	private int edad;
	@Column(name="raza")
	private String raza;
	@Column(name="sexo")
	private boolean sexo;
	@Column(name="peso")
	private float peso;
	@Column(name="estado")
	private int estado;
	@Column(name="fecha_ingreso")
	private LocalDate fechaIngreso;

}
