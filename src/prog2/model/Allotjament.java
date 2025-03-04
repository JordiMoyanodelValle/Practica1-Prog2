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

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(String id) {
        this.idAllotjament = id;
    }

    public String getId() {
        return idAllotjament;
    }


    public boolean correcteFuncionament() {
        return false;
    }


    public long getEstadaMinima(Temp temp) {
        return 0;
    }


    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {

    }
}


