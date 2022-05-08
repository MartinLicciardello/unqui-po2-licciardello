package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> numeros;

	public Multioperador() {
		this.numeros = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
	
	/*Agrega un solo numero al ArrayList de numeros*/
	public void addNumero(Integer x) {
		this.getNumeros().add(x);
	}
	
	public int sumaDeNumeros() {
		return (int) this.getNumeros().stream().reduce(0, (acum,elem) -> acum + elem);
	}
	
	public int restaDeNumeros() {
		return (int) this.getNumeros().stream().reduce(0, (acum,elem) -> acum - elem);
	}
	
	public int multiplicacionDeNumeros() {
		return (int) this.getNumeros().stream().reduce(1, (acum,elem) -> acum * elem);
	}
	
}