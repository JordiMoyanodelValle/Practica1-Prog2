package prog2.model;

public class Parcela extends Allotjament {
    private final String nom;
    private final String IdAllotjament;
    private final float metres;
    private final boolean connexióElectrica;

    public Parcela (String nom, String idAllotjament, float metres , boolean conexióElectrica){
        this.nom = nom;
        this.IdAllotjament = idAllotjament;
        this.metres = metres;
        this.connexióElectrica = conexióElectrica;
    }
}
