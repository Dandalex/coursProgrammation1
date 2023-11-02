import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import devoir1.NombreRemarquables;

class cours7Test {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNombreDeCartes() {
		int expectedValue=7;
		int actualValue = cours7.nombreDeCartes(2);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testNombreDeCartes2() {
		int expectedValue=0;
		int actualValue = cours7.nombreDeCartes(0);
		assertEquals(expectedValue, actualValue);
	}
	

}
