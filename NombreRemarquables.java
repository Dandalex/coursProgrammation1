import java.util.Scanner;

public class NombreRemarquables {

    public static void main (String []args){
        Scanner scan = new Scanner (System.in);
        System.out.println("entrer un nombre entier");
        int n = scan.nextInt();
        boolean estSimiliCarre= estSimiliCarre(n);
        //emunererChiffre(n);
        System.out.println(n+ " est simili caree ?"+ estSimiliCarre);
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
            System.out.println("le carree est "+nCarre);
        boolean estSimiliCarre = false;
        while (n>0){
            if (n%10!=nCarre%10){
                estSimiliCarre = false;
                break;
            }
            n = n/10;
            nCarre = nCarre/10;
            System.out.println("le carree est "+nCarre+" et le nombre est egale a "+ n);
            if (n==0){
                estSimiliCarre = true;
            }
        }
        return estSimiliCarre;
    }

    public static boolean estPrimier (int n){
            boolean estPremier = false;
            //a faire, aurait exemple sur moodle


            return estPremier;
        }

    public static boolean estExtraPrimier (int n){
        boolean estExtraPremier = false;
        //a faire, aurait exemple sur moodle


        return estExtraPremier;
    }



}
