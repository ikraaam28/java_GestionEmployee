import java.util.Comparator;
import java.util.Objects;

public class Employe   {
    private int id;
    private String nom;
    private String prenom;
    private String nomDepart;
    private int grade;


    public Employe() {
    }

    public Employe(int id, String nom, String prenom, String nomDepart, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepart = nomDepart;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepart() {
        return nomDepart;
    }

    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && Objects.equals(nom, employe.nom);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepart='" + nomDepart + '\'' +
                ", grade=" + grade +
                '}';
    }


//    @Override
//    public int compareTo(Employe o) {
//        return this.id - o.getId();
//    }
}
