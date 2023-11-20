import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{

   private Set<Departement> listdep =new HashSet<>();


    @Override
    public void ajouterDepartement(Departement departement) {
      listdep.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
       for(Departement d: listdep){
           if(d.getNomDepart().equals(nom)){
               return true;
           }
       }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return listdep.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        listdep.remove(departement);
    }

    @Override
    public void displayDepartement() {
              for(Departement o:listdep ){
            System.out.println(o);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> trelist =new TreeSet<>(new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {
                return o1.getId()-o2.getId();
            }
        });
        trelist.addAll(listdep);
        return trelist;
    }
}
