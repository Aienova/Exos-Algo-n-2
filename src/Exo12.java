public class Exo12 {


    
            /*  EXERCICE 2 : Créer un algo qui affiche successivement les puissances de 2 */

    public static void main(String[] args) throws Exception {

                /* Déclaration de la variable puissance qui doit être double et la limite du comptage  */

        int puissance;

        int maxcount = 10;
                            /* Démarrage du compteur à partir de 0 jusqu'à 10 */

        for(int i=0; i<=maxcount;i++){

                    /* Puissance 2 par chaque nombre entre 0 et max */

            puissance = (int)Math.pow(2, i);

                    /* Afficher le résultat */
        System.out.println("Puissance de "+i+" sur 2 vaut :"+puissance);

        }




    }
}
