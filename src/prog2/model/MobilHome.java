package prog2.model;

public class MobilHome extends Casa{
    //Definim els atributs i el constructor (si te super es perque herencia d'una clase superior)
    private boolean terrassaAmbBarbacoa;

    public MobilHome(String nom, String id, String mida, int habitacions, int capacitat, boolean terrassaAmbBarbacoa) {
        super(nom, id, mida, habitacions, capacitat,5,3);
        this.terrassaAmbBarbacoa = terrassaAmbBarbacoa;
    }
    //Fem tots els getters i setters
    public boolean isTerrassaAmbBarbacoa() {
        return terrassaAmbBarbacoa;
    }

    public void setTerrassaAmbBarbacoa(boolean terrassaAmbBarbacoa) {
        this.terrassaAmbBarbacoa = terrassaAmbBarbacoa;

    }
}