package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	public final double SALARIO_MINIMO = 210000.00;
	public final double AUMENTO= 20000.00;
	
	private String nombre;
	private int legajo;
	private double salario;
	
	public Empleado(String nombre, int legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if(salario<SALARIO_MINIMO) {
			this.salario = SALARIO_MINIMO;
		}
		else {
			this.salario = salario;
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("Salario: $"+salario);
	}
	
	public void darAumento() {
		this.salario=salario+AUMENTO;
	}
}
