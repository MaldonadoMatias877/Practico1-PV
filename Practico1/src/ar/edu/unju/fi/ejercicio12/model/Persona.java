package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
	private String nombre;
	private Calendar fecha_nacimiento;
	
	// Constructor
    public Persona(String nombre, int dia, int mes, int año) {
        this.nombre = nombre;
        this.fecha_nacimiento = new GregorianCalendar(año, mes - 1, dia); // Mes - 1 porque Calendar usa índices 0-11
    }
	public int calcularEdad() {
		Calendar hoy = Calendar.getInstance();
        int edad = hoy.get(Calendar.YEAR) - fecha_nacimiento.get(Calendar.YEAR);
        
        // Verificar si ya pasó el cumpleaños este año
        if (hoy.get(Calendar.MONTH) < fecha_nacimiento.get(Calendar.MONTH) || 
            (hoy.get(Calendar.MONTH) == fecha_nacimiento.get(Calendar.MONTH) && hoy.get(Calendar.DAY_OF_MONTH) < fecha_nacimiento.get(Calendar.DAY_OF_MONTH))) {
            edad--; // Si no ha pasado el cumpleaños, restamos 1
        }
        return edad;
	}
	public String obtenerSignoZodiacal() {
		int dia = fecha_nacimiento.get(Calendar.DAY_OF_MONTH);
        int mes = fecha_nacimiento.get(Calendar.MONTH) + 1; // Los meses en Calendar son de 0 a 11
        
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
	}
	public String obtenerEstacion() {
		int mes = fecha_nacimiento.get(Calendar.MONTH)+1;
		if(mes>=4 && mes <=6) {
			return "Otoño";
		}
		else if(mes>=9 && mes<=12) {
			return "Primavera";
		}
		else if(mes>=12 && mes>=1 && mes <=2) {
			return "Verano";
		}
		else {
			return "invierno";
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Calendar getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Calendar fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
}
