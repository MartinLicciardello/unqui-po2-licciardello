import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Cuadrado;
import ar.edu.unq.po2.tp3.Point;

class CuadradoTestCase {

	private Cuadrado cuadrado;
	private Point punto;
	
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	punto = new Point(2,3);
	cuadrado = new Cuadrado(punto, 3);
	//Se agregan los numeros. Un solo par y nueve impares
	}
	
	@Test
	public void a() {
		assertEquals(cuadrado.getPunto().getX(), 2);
		assertEquals(cuadrado.getPunto().getY(), 3);
		assertEquals(cuadrado.getPuntoA().getX(), 2);
		assertEquals(cuadrado.getPuntoA().getY(), 6);
		assertEquals(cuadrado.getPuntoB().getX(), 5);
		assertEquals(cuadrado.getPuntoB().getY(), 6);
		assertEquals(cuadrado.getPuntoC().getX(), 5);
		assertEquals(cuadrado.getPuntoC().getY(), 3);
	}

}
