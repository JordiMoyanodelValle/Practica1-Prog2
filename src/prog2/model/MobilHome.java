package prog2.model;

public class MobilHome extends Casa{

    private boolean terrassaAmbBarbacoa;
    private long estadaMinimaALTA = 5;
    private long estadaMinimaBAIXA = 3;

    public MobilHome(String nom, String id, String mida, int habitacions, int capacitat, boolean terrassaAmbBarbacoa) {
        super(nom, id, mida, habitacions, capacitat,5,3);
        this.terrassaAmbBarbacoa = terrassaAmbBarbacoa;
    }

    public boolean isTerrassaAmbBarbacoa() {
        return terrassaAmbBarbacoa;
    }

    public void setTerrassaAmbBarbacoa(boolean terrassaAmbBarbacoa) {
        this.terrassaAmbBarbacoa = terrassaAmbBarbacoa;

    }
}