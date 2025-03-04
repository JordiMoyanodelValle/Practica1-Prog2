package prog2.model;

public class Parcela extends Allotjament {
    private final float metres;
    private final boolean connexióElectrica;

    public Parcela (String nom, String idAllotjament, float metres , boolean conexióElectrica){
        super(nom, idAllotjament);
        this.metres = metres;
        this.connexióElectrica = conexióElectrica;
    }
}
