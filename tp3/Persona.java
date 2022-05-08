package ar.edu.unq.po2.tp3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Persona {
	
	private String nombre;
	private Date fecNac;
	
	public Persona (String nombre, Date fecNac){
		this.nombre = nombre;
		this.fecNac = fecNac;
	}
	
	public int calcularEdad() {
		LocalDate fecHoy = LocalDate.now();
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        SimpleDateFormat x =  new SimpleDateFormat("E dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(x.format(this.getFecNac()), fmt);
        
        Period periodo = Period.between(fechaNac, fecHoy);
        return periodo.getYears();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecNac() {
		return fecNac;
	}

	public void setFecNac(Date fecNac) {
		this.fecNac = fecNac;
	}

}
