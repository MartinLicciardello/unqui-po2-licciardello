package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	

	private ArrayList<Integer> numeros;
	
	/*---------------------------------------------------------------*/
	
	/*Constructor*/
	public Counter() {
		this.numeros = new ArrayList<Integer>();
	}

	/*Getter*/
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	/*Setter*/
	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
	
	/*Agrega un solo numero al ArrayList de numeros*/
	public void addNumber(Integer x) {
		this.getNumeros().add(x);
	}
	
	/*Describe la cantidad de pares*/
	public int cantPares(){
		return (int) this.getNumeros().stream().filter(numero->this.esPar(numero)).count();
	}
	
	/*Describe si un numero es par*/
	private boolean esPar(int numero) {
		return (numero % 2) == 0;
	}
	
	/*Describe la cantidad de impares*/
	public int cantImpares(){
		return (int) this.getNumeros().stream().filter(numero->!this.esPar(numero)).count();
	}
	
	/*Describe la cantidad de multiplos de un numero*/
	public int cantMultiplosDe(int valor){
		return (int) this.getNumeros().stream().filter(numero->this.esMultiplo(numero, valor)).count();
	}
	
	/*Describe si un numero es par*/
	private boolean esMultiplo(int numero1, int numero2) {
		return (numero1 % numero2) == 0;
	}
	
	
}