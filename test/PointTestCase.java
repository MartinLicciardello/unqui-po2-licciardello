import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;

class PointTestCase {

	private Point point;
	
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	point = new Point();
	//Se agregan los numeros. Un solo par y nueve impares
	}
	
	@Test
	public void inicializarSinParametros() {
        
	                
	    // I check the amount is the expected one
	    assertEquals(point.getX(), 0);
	    assertEquals(point.getY(), 0);
	    }
	
	public void testMoverPunto() {
        
    // Getting the even occurrences
    point.moverXY(3,4);
                
    // I check the amount is the expected one
    assertEquals(point.getX(), 3);
    assertEquals(point.getY(), 4);
    }
	
	public void testSumarPunto() {
        
	// Getting the even occurrences
	Point nuevoPunto = new Point(3,4);
	point.sumarPunto(nuevoPunto);
	
	// I check the amount is the expected one
	assertEquals(point.getX(), 3);
	assertEquals(point.getY(), 4);
	}
}
