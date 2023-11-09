import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

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

	@Test
	void testArrayEquals1(){
		int[] a ={1,2,3,4,5,6,7,8};
		int[] b ={1,2,3,4,5,6,7,8};
		boolean expectedValue= true;
		boolean actualValue = cours7.equalsArray(a,b);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testArrayEquals2(){
		int[] a ={2,3,4,5,6,7,8,9};
		int[] b ={1,2,3,4,5,6,7,8};
		boolean expectedValue= false;
		boolean actualValue = cours7.equalsArray(a,b);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void testOrdreCroissant(){
		int[] a ={2,3,4,5,6,7,8,9};
		boolean expectedValue= true;
		boolean actualValue = cours7.ordreCroissant(a);
		assertEquals(expectedValue, actualValue);
	}


}
