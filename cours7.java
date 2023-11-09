public class cours7 {
    public static void main(String[] args) {
      int [] notes = {45,67,89,4,76,34,67,87,53,56,87,54,34,65,34,6,7,4,2,};

      int compteur=0;
      for (int i =0; i<notes.length; i++){
            System.out.println(notes[i]);
            if (notes[i]>60){
                compteur = compteur+1;
            }
      }
      System.out.println("le nombre de gens avec plus de 60% est "+compteur);
      double moyenne=0;
      int somme=0;
      for(int i=0; i<notes.length; i++){
        somme = notes[i] + somme;
        moyenne = somme*1.0/ notes.length;
      }
      trierSelection(notes);
      for (int test:notes) {
    	  System.out.println(test);
      }
    System.out.println("La moyenne est  "+moyenne); 
    int NoteLaPLusBasse = noteLaPlusBasse(notes);
    System.out.println("la note la plus basse est " +NoteLaPLusBasse);
        
    
	}
    
    
    public static void trierSelection(int[] tab){
        trierSelRecursif(tab, 0, tab.length);
      }
      
      public static void trierSelRecursif(int[] tab, int debut , int fin){

        //if cas de base
        if(debut==fin-1){
          return; // rien a faire
        }
        //trouver la plus petite valeur entre debut et fin
        int candidat= tab[debut];
        int position_min = debut;
        for (int i = debut; i < fin; i++){
          if(tab[i] < candidat){
            candidat = tab[i];
            position_min = i;
          }
        }
        // permuter les valeurs a la position "debut" et la position "position_min"
        int temp = tab[debut];
        tab[debut] = tab[position_min];// position du min
        tab[position_min] = temp;

        trierSelRecursif(tab, debut+1, fin);

        
      }
    
    
    
    
    
    public static void sortArrayIncrease (int[]a) {
		boolean changement = false;	
    	do {
    		changement=false;
			for (int i=0; i<a.length-1; i++) {
				if(a [i] > a[i+1]) {
					int temp;
					temp = a[i];
					a[i]= a[i+1];
					a[i+1]=	temp;	
					changement=true;
				}
			}		
		}while (changement==true);
			/* on pourrait mettre une valeur boolean, false avant le boucle for
			 * et devient true dans le if*/
			}
			
			

    public static boolean equalsArray (int [] a,int []b){
        if (a.length!=b.length){
            return false;
        }
        for (int i =0; i<a.length; i++){
            if (a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean ordreCroissant (int[] a){
        for (int i =1; i<a.length;i++){
            if(a[i]<a[i-1]){
                return false;
            }
        }
        return true;
    }



    public static int noteLaPlusBasse (int [] notes){
        int noteLaPLusBasse=notes[0];
        for (int i=0; i<notes.length; i++){
            if (notes[i]<noteLaPLusBasse){
                noteLaPLusBasse = notes[i];
            }
        }
        
        return noteLaPLusBasse;
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
