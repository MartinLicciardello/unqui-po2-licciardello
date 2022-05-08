package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	
	private String nombre;
	private double precio;
	
	public ProductoPrimeraNecesidad(String nombre, double precio){
		super(nombre, precio);
		
	}
	
	@Override
	public boolean esPrecioCuidado() {
		
	}
}
