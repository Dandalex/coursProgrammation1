public class cours7 {
    public static void main(String[] args) {

	}


    public static int nombreDeCartes (int n){
        if (n<=0) {
        	return 0;
        }
    	if (n==1){
            return 2;
        }
        else{
            int cartes = 3*n-1+nombreDeCartes(n-1);
            return cartes;
        }
    
    }

}
