package devoir1;
import java.util.Scanner;

public class NombreRemarquables {

	public static void main (String []args){
		manualTest(args);
	}
	
    public static void manualTest (String []args){
        Scanner scan = new Scanner (System.in);
        System.out.println("entrer un nombre entier");
        //int n=-25;
        int n = scan.nextInt();
        boolean estSimiliCarre= estSimiliCarre(n);
        //emunererChiffre(n);
        //boolean estPremier = estPremier(n);
        //System.out.println(n+ " est premier ?"+ estPremier);
        System.out.println(n+ " est simili carre ?"+ estSimiliCarre);
        scan.close();
    }
    
    

    public static void emunererChiffre (int n){
        while(n>0){
            int a = n%10;
            n = n/10;
            System.out.print(a);
            if (n>0){    
                System.out.print(",");
            }
        }
    }

    public static boolean estSimiliCarre (int n){
        int nCarre= n*n;
        boolean estSimiliCarre = true;
        if (n<0) {
        	n=-n;
        }
        while (n>=0){
            if (n%10!=nCarre%10){
                estSimiliCarre = false;
                break;
            }
            n = n/10;
            nCarre = nCarre/10;
            if (n==0){
                estSimiliCarre = true;
                return estSimiliCarre;
            }
        }
        return estSimiliCarre;
    }

    public static boolean estPremier (int n){
            boolean estPremier = true;
            	for (int i=2;i<=n/2;i++) {
            		if(n%i==0) {
            			estPremier=false;
            			return estPremier;
            		}
            	}
            return estPremier;
        }

    public static boolean estExtraPremier (int n){
        boolean estExtraPremier = true;
        	while (n>0) {
        		estExtraPremier = estPremier (n);
        		if (estExtraPremier = false) {
        			return estExtraPremier;
        		}
        		else {
        			n= n/10;
        		}
        	}


        return estExtraPremier;
    }



}
