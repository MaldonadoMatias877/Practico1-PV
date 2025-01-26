package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese fecha de nacimiento");
		System.out.println("Dia: ");
		int dia = scanner.nextInt();
		System.out.println("Mes: ");
		int mes = scanner.nextInt();
		System.out.println("año: ");
		int anio= scanner.nextInt();
		
		Persona persona = new Persona(nombre, dia, mes, anio);
		System.out.println("\n** Datos de la Persona **");
	    System.out.println("Nombre: " + persona.getNombre());
		
		System.out.println("Fecha de Nacimiento: " + persona.getFecha_nacimiento().get(Calendar.DAY_OF_MONTH) + "/" 
                + (persona.getFecha_nacimiento().get(Calendar.MONTH) + 1) + "/" 
                + persona.getFecha_nacimiento().get(Calendar.YEAR));
		System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.obtenerSignoZodiacal());
        System.out.println("Estación: " + persona.obtenerEstacion());
		
		scanner.close();
	}

}
