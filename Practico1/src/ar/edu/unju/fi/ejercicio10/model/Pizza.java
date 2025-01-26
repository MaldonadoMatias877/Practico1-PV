package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	final int ING_ESP20=500;
	final int ING_ESP30=750;
	final int ING_ESP40=1000;
	
	private int diametro;
	private double precio;
	private double area;
	private boolean ing_esp;
	
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIng_esp() {
		return ing_esp;
	}
	public void setIng_esp(boolean ing_esp) {
		this.ing_esp = ing_esp;
	}
	//Constructor por defecto
	public Pizza() {
		
	}
	//Metodo para calcular el precio de la pizza
	public void calcularPrecio() {
		if(diametro==20 && ing_esp==false) {
			this.precio = 4500;
		}
		else if(diametro==20 && ing_esp==true) {
			this.precio = 4500 + ING_ESP20;
		}
		else if(diametro == 30 && ing_esp==false) {
			this.precio = 4800;
		}
		else if(diametro==30 && ing_esp==true) {
			this.precio= 4800+ING_ESP30;
		}
		else if(diametro==40 && ing_esp==false) {
			this.precio = 5500;
		}
		else if(diametro==40 && ing_esp==true) {
			this.precio = 5500 + ING_ESP40;
		}
	}
	
	// Método para calcular el área de la pizza
    public void calcularArea() {
        area = Math.PI * Math.pow(diametro / 2.0, 2);
    }
}
