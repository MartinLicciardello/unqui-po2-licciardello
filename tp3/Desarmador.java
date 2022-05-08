package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Desarmador {
	
	private ArrayList<Integer> numeros;
	
	public Desarmador() {
		this.numeros = new ArrayList<Integer>();
	}
	
	/*Agrega un solo numero al ArrayList de numeros*/
	public void addNumber(int x) {
		this.getNumeros().add(x);
	}
	
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
	
	public int mayorCantPares(ArrayList<Integer> numeros) {
		int mayorHastaAhora = 0;
		
		if (!numeros.isEmpty() && cantidadDigitosPar(numeros.get(0)) >  mayorHastaAhora) {
			mayorHastaAhora = numeros.get(0);
			numeros.remove(0);
			return mayorCantPares(numeros);
		} else {
			return mayorHastaAhora;
		}
	}
	
	public int cantidadDigitosPar(int num) {
	     int cantidad = 0;
	     int numerosRestantes = num;
	     
	     while(numerosRestantes > 0) {    
	        int digito = numerosRestantes % 10;
	        
	        if(digito % 2 == 0) cantidad++;
	        
	        numerosRestantes /= 10;
	     }
	     
	     return cantidad;
	 }


	
}
