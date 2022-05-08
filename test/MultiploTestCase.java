import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multiplo;

public class MultiploTestCase {
	
	private Multiplo multiplo;
	
	@BeforeEach
	public void setUp() throws Exception {
	multiplo = new Multiplo(2,4);
	}
	
	@Test
	public void testNumerosPares() {
        
    // Getting the even occurrences
    int amount = multiplo.mayorMultiploEntreMil(10,15);
                
    // I check the amount is the expected one
    assertEquals(amount, 990);
    }

}
