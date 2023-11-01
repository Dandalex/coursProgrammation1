import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cours6Test {

	@Test
	void test() {
		assert (cours6.carre(-2)==4);
		assert (cours6.carre(0)==0);
		assert (cours6.carre(9)==81);
	}
	void test2() {
		assert(cours6.carre(99)==10);
		
	}



}
