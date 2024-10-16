public class exo17 {


    /*  EXERCICE 7 : Créer un algorithme qui simule des opérations bancaires, dont vous effectuer un paiement en 3 fois par carte d'un montant donner à votre guise. Donner le solde restant à chaque opération. 
    Sachant que vous avez au choix 3 types de cartes qui n'ont pas les mêmes règles de découvert. Votre solde bancaire de départ sera de 1000€
    
     * 
     * A noter vous avez 3 types de cartes :
     * 
     * Carte Classique (id:1): minimum -500€ de découvert
     * Carte Gold (id:2): minmium -1000€ de découvert
     * Carte Electron (id:0) : minimum 0€ de découvert
       */

    public static void main(String[] args) throws Exception {


        double solde = 1000.00;                 /* Solde de départ à 1000€ */

        int card = 2;                 /* Type de carte bancaire , Classique : 1 , Gold : 2 , Electron : 0 */

        String cardName = ""; /* Iniatilsiation du nom de la carte */

        double amount = 4566.00;                 /* Montant */
        double overdraft = 0.00; /* Initialisation de l'autorisation de découvert */

        double amountPer3 = amount/3;                 /* Montant à payer en 3 fois */

        /* Formule pour mettre en décimal, deux chiffres après la virgule */

        amountPer3 = (double)Math.round(amountPer3*100)/100;

        double amountLeft = amount - (amountPer3*3);

        double payment;



                /* Changer les valeurs pour chaque type de cartes bancaires */

        switch(card){


            case 0:
                cardName = "Carte Electron";
                overdraft = 0.00;

                break;
            

            case 1:
                cardName = "Carte Classique";
                overdraft = -500.00;
                break;

            case 2:
                cardName = "Carte Gold";
                overdraft = -1000.00;
                break;


        }

                        /* Afficher le solde et le type de carte */

        System.out.println("Votre solde : "+solde+" euros");
        System.out.println("Votre carte : "+cardName);


                                /* Lancer les paiement en 3 fois */

        for(int i = 1; i<=3; i++){



            /* Vérifier si le paiement ne dépasse pas l'autorisation de découvert */


            if(i==1){

                payment = amountPer3 + amountLeft;
                payment = (double)Math.round(payment*100)/100;

            }else{

                payment = amountPer3;
                payment = (double)Math.round(payment*100)/100;

            }

            System.out.println("Paiement n°"+i+" : "+payment+" euros");

            if( (solde -payment)  >= overdraft ){

            /* Si Vrai alors , déduire le paiement de la solde */

                System.out.println("Opération approuvée");
                solde = solde - payment;
                solde = (double)Math.round(solde*100)/100;

                System.out.println("Solde restant : "+solde+" euros");

            }else{

                            /* Si Faux alors , bloquer l'opération */

                System.out.println("Opération refusée");
                System.out.println("solde insufissant");
                break;


                /*  Comment faire pour stopper l'algo quand l'autorisation de découvert a été dépassé ? */

            }

            System.out.println("/*---------------------------------*/");



        }


    }

        /*  Résultat Attendu : 


         *Votre solde : 1000.00€ 
         Votre carte : carte electron
         paiement en 3 fois de 1500€

         * 
         * paiement n°1 : 500.00€
         * Opération approuvé
         * solde restant : 500.00€
         * 
         * paiement n°2 : 500.00€
         * Operation approuvé
         * solde restant : 0€
         * 
         * 
         * paiement n°3 : 500.00€
         * Operation refusé
         * solde inssufissant
         * 
         * 
        */

}
