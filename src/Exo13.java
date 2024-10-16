public class Exo13 {


    /*  EXERCICE 3 : Vérifier si les 3 entrée ( A ou B ) ET C sont vrai* , afficher sa sortie */

public static void main(String[] args) throws Exception {

              /* Déclaration des variables A,B et C en Booléen  */
    boolean A = true;
    boolean B = false;
    boolean C = false;


                  /* Condition avec les opérateur logique ce qui équivaut en algèbre de Boole à
                   * 
                   * ( A OU B ) ET C
                   * 
                    */

    if( (A || B) && C){

        /* Si TRUE */

/* Afficher le résultat */
System.out.println("VRAI");
        
    }else{

                /* Si FALSE */

/* Afficher le résultat */
System.out.println("FAUX");

    }




}



}
