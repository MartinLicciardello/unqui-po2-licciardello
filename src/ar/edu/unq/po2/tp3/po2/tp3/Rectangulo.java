package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	private Point origen;
	private Point puntoA;
	private Point puntoB;
	private Point puntoC;
	
	int base;
	int altura;
	
	public Rectangulo(Point origen, int base, int altura) {
		this.origen = origen;
		this.base = base;
		this.altura = altura;
		
		this.puntoA = new Point(this.getOrigen().getX(), this.getOrigen().getY() + getAltura());
		this.puntoB = new Point(this.getOrigen().getX() + getBase(), this.getOrigen().getY() + getAltura());
		this.puntoC = new Point(this.getOrigen().getX() + getBase(), this.getOrigen().getY());
	
	}

	public Point getOrigen() {
		return origen;
	}

	public void setOrigen(Point origen) {
		this.origen = origen;
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

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int area() {
		return this.base * this.altura;
	}
	
	public int perimetro() {
		return (this.base * 2) + (this.altura * 2);
	}
	
	public String esHorizontalOVertical() {
		if (this.base > this.altura) {
			return "Horizontal";
		} else {
			return "Vertical";
		}
	}
}
