package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private int codigo;
	private double precio;
	private int descuento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		if(descuento>=0 && descuento<=50) {
			this.descuento = descuento;
		}
		else
			System.out.println("El descuento debe ser entre 0 y 50");
	}
	
	//Constructor por defecto
	public Producto() {
		
	}
	//metodo que devuelve el resultado del producto con descuento
	public double calcularDescuento() {
		if(descuento>0) {
			return precio*(1-descuento/100.0);
		}
		return precio;
	}
}
