import java.util.TreeSet;

public class MainDepart {
    public static void main(String[] args) {
        DepartementHashSet depart = new DepartementHashSet();

        // Ajout de départements
        Departement dep1 = new Departement(1, "Informatique", 20);
        Departement dep2 = new Departement(2, "RH", 15);
        Departement dep3 = new Departement(3, "Finance", 30);

        depart.ajouterDepartement(dep1);
        depart.ajouterDepartement(dep2);
        depart.ajouterDepartement(dep3);

        // Affichage des départements non triés
        System.out.println("Départements non triés :");
        depart.displayDepartement();

        // Recherche d'un département par nom

        System.out.println("Recherche du département '" +
                depart.rechercherDepartement("Informatique"));

        // Suppression d'un département
        depart.supprimerDepartement(dep2);

        // Affichage des départements après suppression
        System.out.println("Départements après suppression :");
        depart.displayDepartement();

        // Tri des départements par ID
        TreeSet<Departement> departTrie = depart.trierDepartementById();

        // Affichage des départements triés
        System.out.println("Départements triés par ID :");
        for (Departement d : departTrie) {
            System.out.println(d);
        }

    }
}
