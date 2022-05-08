import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Desarmador;

public class DesarmadorTestCase {
	private Desarmador desarmador;
	
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	desarmador = new Desarmador();
	//Se agregan los numeros. Un solo par y nueve impares
	desarmador.addNumber(20);
	desarmador.addNumber(23);
	desarmador.addNumber(17);
	}
	
	@Test
	public void testCantPares() {
        
    // Getting the even occurrences
    int amount = desarmador.cantidadDigitosPar(20);
                
    // I check the amount is the expected one
    assertEquals(amount, 2);
    }
	
	public void testMayorCantPares() {
        
	    // Getting the even occurrences
	    int amount = desarmador.mayorCantPares(null);
	                
	    // I check the amount is the expected one
	    assertEquals(amount, 20);
	    }
	
}
