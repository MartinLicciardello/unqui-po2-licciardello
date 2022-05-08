package ar.edu.unq.po2.tp3;

public class Cuadrado {
	
	private Rectangulo rectangulo; 
	private Point punto;
	private int tamaño;
	private Point puntoA;
	private Point puntoB;
	private Point puntoC;

	public Cuadrado(Point punto, int tamaño) {
		this.rectangulo = new Rectangulo(punto, tamaño, tamaño);
		this.punto = punto;
		this.tamaño = tamaño;
		this.puntoA = new Point(getPunto().getX(), getPunto().getY() + getTamaño());
		this.puntoB = new Point(getPunto().getX() + getTamaño(), getPunto().getY() + getTamaño());
		this.puntoC = new Point(getPunto().getX() + getTamaño(), getPunto().getY());
	}

	public Point getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(Point puntoA) {
		this.puntoA = puntoA;
	}

	public Point getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(Point puntoB) {
		this.puntoB = puntoB;
	}

	public Point getPuntoC() {
		return puntoC;
	}

	public void setPuntoC(Point puntoC) {
		this.puntoC = puntoC;
	}

	public Rectangulo getRectangulo() {
		return rectangulo;
	}

	public void setRectangulo(Rectangulo rectangulo) {
		this.rectangulo = rectangulo;
	}

	public Point getPunto() {
		return punto;
	}

	public void setPunto(Point punto) {
		this.punto = punto;
	}
	
	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
}
