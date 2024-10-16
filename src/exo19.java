public class exo19 {

        /*  EXERCICE 9 : Convertir des jours au format année | mois | jours , à partir de la date du 1er Janvier 2024 , en prendra en compte les années bissextiles et les mois finissant le 31 */

    public static void main(String[] args) {
        
        int nombreDeJours = 703; // Exemple : nombre de jours à convertir

        int nombreDeJoursInit = nombreDeJours; // Exemple : nombre de jours à convertir
        
        // Variables pour stocker le résultat
        int annees = 0;
        int mois = 0;
        int joursRestants = 0;

        // Calculer les années complètes
        while (nombreDeJours >= 365) {
            // Vérifier si l'année est bissextile
            if ((2024 + annees) % 4 == 0 && ((2024 + annees) % 100 != 0 || (2024 + annees) % 400 == 0)) {
                // Année bissextile (366 jours)
                if (nombreDeJours >= 366) {
                    nombreDeJours = nombreDeJours - 366;
                    annees = annees + 1;
                } else {
                    break; // Si le reste est moins de 366 jours, arrêter la boucle
                }
            } else {
                // Année non bissextile (365 jours)
                nombreDeJours = nombreDeJours - 365;
                annees = annees + 1;
            }
        }

        // Calculer les mois complets
        while (nombreDeJours >= 28) {
            int joursDansMois;

            // Déterminer le nombre de jours dans le mois actuel
            if (mois == 1) { // Février
                if ((2024 + annees) % 4 == 0 && ((2024 + annees) % 100 != 0 || (2024 + annees) % 400 == 0)) {
                    joursDansMois = 29; // Année bissextile
                } else {
                    joursDansMois = 28; // Année non bissextile
                }
            } else if (mois == 3 || mois == 5 || mois == 8 || mois == 10) {
                joursDansMois = 30; // Avril, Juin, Septembre, Novembre ont 30 jours
            } else {
                joursDansMois = 31; // Les autres mois ont 31 jours
            }

            // Vérifier si on peut soustraire le mois en cours
            if (nombreDeJours >= joursDansMois) {
                nombreDeJours = nombreDeJours - joursDansMois;
                mois = mois + 1;
            } else {
                break; // Si le reste est moins que le nombre de jours dans le mois, arrêter la boucle
            }
        }

        // Les jours restants
        joursRestants = nombreDeJours;

        // Afficher le résultat
        System.out.println(nombreDeJoursInit+" jours à partir du janvier 2024 correspond à : " + annees + " an(s), " + mois + " mois, et " + joursRestants + " jour(s).");
    }
}
