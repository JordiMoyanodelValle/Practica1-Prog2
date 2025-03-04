package prog2.model;

public class MobilHome extends Casa{
    private boolean terrasaAmbBarbacoa;
    public MobilHome(String nom, String id, String mida, int habitacions, int capacitat, boolean terrasaAmbBarbacoa) {
        super(nom, id, mida, habitacions, capacitat);
        this.terrasaAmbBarbacoa = terrasaAmbBarbacoa;
    }
}
