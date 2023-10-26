import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cours6Test {

	@Test
	void test() {
		assert (cours6.carre(-2)==4);
	}
	void test2() {
		assert (cours6.carre(0)==0);
	}
	void test3() {
		assert (cours6.carre(9)==90);
	}



}
