public class exo16 {



    /*  EXERCICE 6 : 
    
    Créer un algo qui calcule le coût en kilomêtrage d'un déplacement en voiture selon le type de carburant ( diesel : 0  ; sans plomb 95 : 1 ; sans plomb 98 : 2) 
     * 
     * 
     * 
     * NOTE : Comme les prix des carburant varient chaque jours, veuillez-vous référer à ce site et prendre en compte que la valeur d'aujourd'hui :
     * https://www.automobile-club.org/tourisme-et-voyages/prix-des-carburants/tendances
     * 
     * 
     * En France une voiture consomme en moyenne 6L/100 km
     * 
     */

    public static void main(String[] args) throws Exception {

        /* Les prix des carburants d'aujourd'hui selon le site web https://www.automobile-club.org/tourisme-et-voyages/prix-des-carburants/tendances */


        double price2 = 1.846; /* Prix Sans plomb 95 Ethanol 5 */
        double price1 = 1.740; /* Prix Sans plomb 98 Ethanol 5 */
        double price0 = 1.661; /* Prix Gazole */
        char euro = '€';

        int carburant = 0; /* Choix du arburant ( diesel : 0  ; sans plomb 95 : 1 ; sans plomb 98 : 2)  */
        String carburantName = ""; /* Initialisation de la variable string nom du carburant */
        int km = 178; /* Nombres de kilomêtres à parcourir */

        double result; /* Résultat en double */


        /* Si le carburant est un  Sans plomb 98 Ethanol 5 */

        if(carburant == 2){ 

            result = (price2 * km * 6)/100;
            carburantName = "Sans plomb 98";

        }
                    /* Si le carburant est un  Sans plomb 95 Ethanol 5 */
        
        else if (carburant == 1) { 

            result = (price1 * km * 6)/100;
            carburantName = "Sans plomb 95";

            
        } 
        
                    /* Si le carburant est un Gazole */

        else { 


            carburantName = "Diesel";
            result = (price0 * km * 6)/100;

        }

        result = (double)Math.round(result*100)/100;

        /* Afficher le résultat */
        System.out.println(km+"km, pour une voiture type "+ carburantName+" coûte "+result+euro);
        
        }


        /* Résultat attendu  200km pour une voiture en diesel coûte  19.68€   (Testez sur les 3 types de carburants) */


}
