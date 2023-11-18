import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe>{

    private ArrayList<Employe> listeEmployes;
    public SocieteArrayList() {
        listeEmployes = new ArrayList<>();
    }
    @Override
    public void ajouterEmploye(Employe employe) {
listeEmployes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (int i = 0; i < listeEmployes.size(); i++) {
            Employe e = listeEmployes.get(i);
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean rechercherEmploye(Employe employe) {
        return listeEmployes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : listeEmployes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
      Collections.sort(listeEmployes, new Comparator<Employe>() {
          @Override
          public int compare(Employe o1, Employe o2) {
              return o1.getId() - o2.getId();
          }
      });

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listeEmployes, new Comparator<Employe>() {
            @Override
            public int compare(Employe emp1, Employe emp2) {
                int result = emp1.getNomDepart().compareTo(emp2.getNomDepart());
                if (result == 0) {
                        result = Integer.compare(emp1.getGrade(), emp2.getGrade());
                    }

                return result;
            }
        });
    }
}
