public class exo20 {


            /*  EXERCICE 10 (Version original) : Créer un algorithme qui affiche un V avec un des symboles "*" (étoiles) , la longueur est de 10 cases    */

    public static void main(String[] args) {
        int hauteur = 10; // Hauteur de la lettre V

        // Boucle pour chaque ligne
        for (int i = 0; i < hauteur; i++) {
            // Boucle pour chaque colonne
            for (int j = 0; j < 2 * hauteur - 1; j++) {
                // Condition pour afficher les étoiles sur les bords
                if (j == i || j == 2 * hauteur - 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Changer de ligne
            System.out.println();
        }
    }


}
