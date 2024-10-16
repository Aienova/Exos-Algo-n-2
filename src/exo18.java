public class exo18 {


    /*  EXERCICE 8 : Créer un algorithme qui convertit n'importe qu'elle valeurs décimal (entier) en binaire */

    public static void main(String[] args) throws Exception {


        int decimal = 0; /* valeurs à décimaal à convertir */
        int left; /* Le reste de la division */
        String binary=""; /* la chaîne de caractère en binaire de la valeur en binaire */
        int div; /* La division */

        System.out.println("******************EXO 8**************************");

        /* Tant que la valeur décimal est supérieur à 0, on fait la division successive */
        
        
        if(decimal == 0){

            System.out.println("valeur en binaire : 0");

            
        }else{

        
        while(decimal>0){

            div = decimal/2;
            left = decimal - (div*2);
            binary = left + binary; /* On ajoute successivement les résultats du reste de la division sucessive de droite à gauche */
            decimal = div;

            System.out.println(left);

        }  

        System.out.println("valeur en binaire :"+binary);

    }




    }
            /*  Résultat Attendu : 1 en décimal vaut 0001 en binaire */
}
