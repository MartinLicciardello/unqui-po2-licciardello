import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

public class MultioperadorTestCase {
	
	private Multioperador multioperador;
	
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	multioperador = new Multioperador();
	//Se agregan los numeros. Un solo par y nueve impares
	multioperador.addNumero(5);
	multioperador.addNumero(10);
	multioperador.addNumero(15);
	multioperador.addNumero(20);
	multioperador.addNumero(25);
	multioperador.addNumero(30);
	}
	
	@Test
	public void testSumaDeNumeros() {
        
    // Getting the even occurrences
    int resultado = multioperador.sumaDeNumeros();
    System.out.println(resultado);            
    // I check the amount is the expected one
    assertEquals(resultado, 105);
    }

	public void testRestaDeNumeros() {
        
	    // Getting the even occurrences
	    int resultado = multioperador.sumaDeNumeros();
	    System.out.println(resultado);            
	    // I check the amount is the expected one
	    assertEquals(resultado, -95);
	    }
	
	public void testMultiplicacionDeNumeros() {
        
	    // Getting the even occurrences
	    int resultado = multioperador.sumaDeNumeros();
	    System.out.println(resultado);            
	    // I check the amount is the expected one
	    assertEquals(resultado, 11250000);
	    }
}
