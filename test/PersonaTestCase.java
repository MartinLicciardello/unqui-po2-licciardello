import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;
import ar.edu.unq.po2.tp3.Persona;

class PersonaTestCase {

	private Persona persona;
	
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	Date fechaNacimiento = new Date(1990, 06, 20);
	persona = new Persona("Juan", fechaNacimiento);
		
	}
	
	@Test
	public void testEdad() {
        
    // Getting the even occurrences
    int edad = persona.calcularEdad();
                
    // I check the amount is the expected one
    assertEquals(edad, 31);
    }

}
