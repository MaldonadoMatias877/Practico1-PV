package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private int dni;
	private String nombre;
	private LocalDate fecha_nacimiento;
	private String provincia;
	
	//Constructor por defecto
	public Persona() {
		
	}
		//Constructor parametrizado
	public Persona(int dni, String nombre, LocalDate fecha_nacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.provincia = provincia;
	}
	//Constructor parametrizado 2
	public Persona(int dni, String nombre, LocalDate fecha_nacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.provincia = "Jujuy";
	}

	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public int calcularEdad() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(fecha_nacimiento, today);
        return period.getYears();
    }

    // Verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }

    // Mostrar datos de la persona
    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fecha_nacimiento);
        System.out.println("Provincia: " + provincia);
        System.out.println("Edad: " + calcularEdad());
        if (esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona no es mayor de edad.");
        }
    }
}