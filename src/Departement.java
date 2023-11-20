import java.util.Objects;

public class Departement {

    private int id;
    private String nomDepart;
    private int nbrEmploye;

    public Departement() {
    }

    public Departement(int id, String nomDepart, int nbrEmploye) {
        this.id = id;
        this.nomDepart = nomDepart;
        this.nbrEmploye = nbrEmploye;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepart() {
        return nomDepart;
    }

    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }

    public int getNbrEmploye() {
        return nbrEmploye;
    }

    public void setNbrEmploye(int nbrEmploye) {
        this.nbrEmploye = nbrEmploye;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nomDepart, that.nomDepart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomDepart);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepart='" + nomDepart + '\'' +
                ", nbrEmploye=" + nbrEmploye +
                '}';
    }
}
