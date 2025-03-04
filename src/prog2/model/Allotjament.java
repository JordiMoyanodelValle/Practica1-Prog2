package prog2.model;

public class Allotjament implements InAllotjament {
    private String nom;
    private String idAllotjament;
    public Allotjament (String nom, String idAllotjament) {
        this.nom = nom;
        this.idAllotjament = idAllotjament;
    }
    public String getNom() {
        return this.nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void setId(String id) {
        this.idAllotjament = id;
    }

    @Override
    public String getId() {
        return idAllotjament;
    }

}


