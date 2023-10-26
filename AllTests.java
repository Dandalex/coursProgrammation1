import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({})

public class AllTests {
	
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

