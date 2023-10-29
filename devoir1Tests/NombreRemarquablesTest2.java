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
		boolean expectedValue=true;
		boolean actualValue = NombreRemarquables.estSimiliCarre(25);
		assertEquals(expectedValue, actualValue);
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
		boolean actualValue = NombreRemarquables.estSimiliCarre(0);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test5EstSimiliCarre() {
		boolean expectedValue=true;
		boolean actualValue = NombreRemarquables.estSimiliCarre(-25);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testenumererChiffre() {
		string actualValue= NombreRemarquables.enumererChiffre(625);
	}

	
	@Test
	void testEstPrimier() {
		fail("Not yet implemented");
	}

	@Test
	void testEstExtraPrimier() {
		fail("Not yet implemented");
	}

}
