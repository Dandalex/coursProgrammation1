package devoir1Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import devoir1.NombreRemarquables;

class NombreRemarquablesTest2 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testEstSimiliCarre() {
		boolean actualValue = NombreRemarquables.estSimiliCarre(25);
		assertTrue(actualValue);
	}
	@Test
	void test2EstSimiliCarre() {
		boolean expectedValue=true;
		boolean actualValue = NombreRemarquables.estSimiliCarre(625);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test3EstSimiliCarre() {
		boolean expectedValue=false;
		boolean actualValue = NombreRemarquables.estSimiliCarre(623);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test4EstSimiliCarre() {
		boolean expectedValue=true;
		boolean actualValue = NombreRemarquables.estSimiliCarre(25);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test5EstSimiliCarre() {
		boolean expectedValue=true;
		boolean actualValue = NombreRemarquables.estSimiliCarre(-25);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test6EstSimiliCarre() {
		boolean expectedValue=true;
		boolean actualValue = NombreRemarquables.estSimiliCarre(0);
		assertEquals(expectedValue, actualValue);
	}
	
	//@Test
	//void testenumererChiffre() {
		//string actualValue= NombreRemarquables.enumererChiffre(625);
	//}

	
	@Test
	void testEstPremier() {
		boolean expectedValue=true;
		boolean actualValue = NombreRemarquables.estPremier(5);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void testEstPremier2() {
		boolean expectedValue=true;
		boolean actualValue = NombreRemarquables.estPremier(7);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void testEstPremier3() {
		boolean expectedValue=false;
		boolean actualValue = NombreRemarquables.estPremier(200);
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testEstExtraPrimier() {
		boolean expectedValue=true;
		boolean actualValue = NombreRemarquables.estExtraPremier(59399);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test2EstExtraPrimier() {
		boolean expectedValue=true;
		boolean actualValue = NombreRemarquables.estExtraPremier(31379);
		assertEquals(expectedValue, actualValue);
	}@Test
	void test3EstExtraPrimier() {
		boolean expectedValue=false;
		boolean actualValue = NombreRemarquables.estExtraPremier(431);
		assertEquals(expectedValue, actualValue);
	}

}
