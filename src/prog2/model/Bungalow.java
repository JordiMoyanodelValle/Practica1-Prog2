package prog2.model;

public class Bungalow extends Casa {
    private int placesParquing;
    private boolean terrassa;
    private boolean tv;
    private boolean aireFred;

    public Bungalow (String nom, String Id, String mida , int capacitat,
                     int habitacions , int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        super(nom, Id, mida, capacitat, habitacions);
        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
    }

}
