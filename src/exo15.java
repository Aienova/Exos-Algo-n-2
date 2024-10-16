public class exo15 {



    /*  EXERCICE 5 : Créer un algo qui vérifie entre chaque nombres de 1 à 20 , si ils sont paires ou impaires */

    public static void main(String[] args) throws Exception {


                                    /* Démarrage du compteur à partir de 1 jusqu'à 20  */


        for(int i=1; i<=20;i++){


                   /* Vérification si le nombre est pair grâce à modulo 2 égale à 0 */

            if((i%2)==0){

                /* si Vrai */
                        /* Afficher le résultat */
            System.out.println(i+" est pair");


            }else{

                                /* si Faux */
    
                System.out.println(i+" est impair");
    
            }
    
            }
        
        }



}
