package devoir1;
import java.util.Scanner;

public class NombresRemarquables {

	public static void main (String []args){
		manualTest(args);
	}
	
    public static void manualTest (String []args){
        Scanner scan = new Scanner (System.in);
        System.out.println("entrer un nombre entier");
        //int n=-25;
        int n = scan.nextInt();
       // boolean estSimiliCarre= estSimiliCarre(n);
        //emunererChiffres(n);
        //boolean estPremier = estExtraPremier(n);
        //System.out.println(n+ " est premier ?"+ estPremier);
        System.out.println(n+ " est simili carre ?");
        scan.close();
    }
    
    

    public static void emunererChiffres (int n){
        while(n>0){
            int a = n%10;
            n = n/10;
            System.out.print(a);
            if (n>0){    
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static boolean estSimiliCarre (int n){
        int nCarre= n*n;
        if (n<0) {
        	n=-n;
        }
        while (n>=0){
            if (n%10!=nCarre%10){
                return false;
            }
            n = n/10;
            nCarre = nCarre/10;
            if (n==0){
                return true;
            }
        }
        return false;
    }

    public static boolean estPremier (int n){
    	if (n<=1) {
    		return false;
    	}
            	for (int i=2;i<=n/2;i++) {
            		if(n%i==0) {
            			return false;
            		}
            	}
            return true;
        }

    public static boolean estExtraPremier (int n){;
        	while (n>0) {
        		
        		if (estPremier(n) == false) {
        			return false;
        		}
        		else {
        			n= n/10;
        		}
        	}
        return true;
    }



}
