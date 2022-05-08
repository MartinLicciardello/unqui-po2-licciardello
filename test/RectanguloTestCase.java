import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Rectangulo;

class RectanguloTestCase {

	private Point point;
	private Rectangulo rectangulo;
	
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	point = new Point(2,3);
	rectangulo = new Rectangulo(point, 8, 3);
	//Se agregan los numeros. Un solo par y nueve impares
	}
	
	@Test
	public void puntoA() {
	    // I check the amount is the expected one
	    assertEquals(rectangulo.getPuntoA().getX(), 2);
	    assertEquals(rectangulo.getPuntoA().getY(), 6);
	    }
	
	public void area() {
		assertEquals(rectangulo.area(), 24);
	}
	
	public void perimetro() {
		assertEquals(rectangulo.area(), 22);
	}
	
	public void esHorizontalOVertical() {
		assertEquals(rectangulo.esHorizontalOVertical(), "Horizontal");
	}

}
