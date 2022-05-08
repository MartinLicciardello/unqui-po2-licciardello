package ar.edu.unq.po2.tp3;

public class Multiplo {
	
	private int x;
	private int y;
	
	public Multiplo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int multiploMayor(int valor1, int valor2) {
		if (esMultiplo(valor1, valor2)) {
			return valor1;
		}
		else {
			return valor2;
		}
	}

	private boolean esMultiplo(int valor1, int valor2) {
		return valor1%valor2==0 || valor2%valor1==0;
	}
	
	public int mayorMultiploEntreMil(int x, int y){
		int mayor = 0;
	    for (int i = 1000; i > 0; i--) {
	    	if(i % x == 0 && i % y == 0){
	    		if(mayor < i) mayor = i;
	         } 
	     }
	     return mayor;
	 }
}
