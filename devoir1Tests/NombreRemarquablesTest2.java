package devoir1Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import devoir1.NombresRemarquables;

class NombreRemarquablesTest2 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testEstSimiliCarre() {
		boolean actualValue = NombresRemarquables.estSimiliCarre(25);
		assertTrue(actualValue);
	}
	@Test
	void test2EstSimiliCarre() {
		boolean expectedValue=true;
		boolean actualValue = NombresRemarquables.estSimiliCarre(625);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test3EstSimiliCarre() {
		boolean expectedValue=false;
		boolean actualValue = NombresRemarquables.estSimiliCarre(623);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test4EstSimiliCarre() {
		boolean expectedValue=true;
		boolean actualValue = NombresRemarquables.estSimiliCarre(25);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test5EstSimiliCarre() {
		boolean expectedValue=true;
		boolean actualValue = NombresRemarquables.estSimiliCarre(-25);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test6EstSimiliCarre() {
		boolean expectedValue=true;
		boolean actualValue = NombresRemarquables.estSimiliCarre(0);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void test7EstSimiliCarre() {
		boolean expectedValue=true;
		boolean actualValue = NombresRemarquables.estSimiliCarre(1);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test9EstSimiliCarre() {
		boolean expectedValue=false;
		boolean actualValue = NombresRemarquables.estSimiliCarre(4);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test10EstSimiliCarre() {
		boolean expectedValue=true;
		boolean actualValue = NombresRemarquables.estSimiliCarre(6);
		assertEquals(expectedValue, actualValue);
	}	
	@Test
	void test11EstSimiliCarre() {
		boolean expectedValue=false;
		boolean actualValue = NombresRemarquables.estSimiliCarre(17);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test121EstSimiliCarre() {
		boolean expectedValue=true;
		boolean actualValue = NombresRemarquables.estSimiliCarre(76);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test1351EstSimiliCarre() {
		boolean expectedValue=true;
		boolean actualValue = NombresRemarquables.estSimiliCarre(376);
		assertEquals(expectedValue, actualValue);
	}
	
	//@Test
	//void testenumererChiffre() {
		//string actualValue= NombresRemarquables.enumererChiffre(625);
	//}

	
	@Test
	void testEstPremier() {
		boolean expectedValue=true;
		boolean actualValue = NombresRemarquables.estPremier(5);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void testEstPremier6() {
		boolean expectedValue=false;
		boolean actualValue = NombresRemarquables.estPremier(1);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void testEstPremier2() {
		boolean expectedValue=true;
		boolean actualValue = NombresRemarquables.estPremier(7);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void testEstPremier3() {
		boolean expectedValue=false;
		boolean actualValue = NombresRemarquables.estPremier(200);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void testEstPremier4() {
		boolean expectedValue=false;
		boolean actualValue = NombresRemarquables.estPremier(400);
		assertEquals(expectedValue, actualValue);
	}@Test
	void testEstPremier5() {
		boolean expectedValue=false;
		boolean actualValue = NombresRemarquables.estPremier(51);
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testEstExtraPrimier() {
		boolean expectedValue=true;
		boolean actualValue = NombresRemarquables.estExtraPremier(59399);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test2EstExtraPrimier() {
		boolean expectedValue=true;
		boolean actualValue = NombresRemarquables.estExtraPremier(31379);
		assertEquals(expectedValue, actualValue);
	}@Test
	void test3EstExtraPrimier() {
		boolean expectedValue=false;
		boolean actualValue = NombresRemarquables.estExtraPremier(431);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void test4EstExtraPrimier() {
		boolean expectedValue=true;
		boolean actualValue = NombresRemarquables.estExtraPremier(373);
		assertEquals(expectedValue, actualValue);
	}

}
