
public class cours6 {

	public static void main(String[] args) {

	}
	
	
	public static int carre (int n) {
		n = n*n;
		return n;
		
	}
	
	public static boolean carreEstCorrecte () {
		int x = 2, x2=-3, x3=0;
		
		if (carre(x)==4&&carre(x2)==9&&carre(x3)==0){
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
