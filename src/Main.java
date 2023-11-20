// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Add some employees
        Employe emp1 = new Employe(5, "John", "Doe", "HR", 3);
        Employe emp2 = new Employe(2, "Jane", "Doe", "IT", 2);
        Employe emp3 = new Employe(9, "Alice", "Smith", "Finance", 1);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);
        System.out.println("liste avant trie ");
        societe.displayEmploye();
//
//        System.out.println("Initial List:");
//        societe.displayEmploye();
//
//
//        String searchName = "Jane";
//        System.out.println("Does the company have an employee named " + searchName + "? " + societe.rechercherEmploye(searchName));


        System.out.println("List after sorting by ID:");
        societe.trierEmployeParId();
        societe.displayEmploye();


//        System.out.println("Removing employee with ID 2:");
//        societe.supprimerEmploye(emp2);
//        societe.displayEmploye();

        System.out.println("List after sorting by name depart and grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
        System.out.println("search employe");
        if(societe.rechercherEmploye(emp2)){
            System.out.println("exist");
        }
        else {
            System.out.println("doeenst exist");
        }
        System.out.println("search employe by name ");
        if(societe.rechercherEmploye("Jane")){
            System.out.println(" Jane exist");
        }
        else {
            System.out.println(" Jane doeenst exist");
        }
        }

    }
