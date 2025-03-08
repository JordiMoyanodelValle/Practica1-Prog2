package prog2.model;

public class Bungalow extends Casa {

    private int placesParquing;
    private boolean terrassa;
    private boolean tv;
    private boolean aireFred;
    private long estadaMinimaALTA;
    private long estadaMinimaBAIXA;

    public Bungalow (String nom, String Id, String mida , int capacitat,
                     int habitacions , int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        super(nom, Id, mida, capacitat, habitacions,7,4);
        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
    }

    public int getPlacesParquing() {
        return placesParquing;
    }

    public void setPlacesParquing(int placesParquing) {
        this.placesParquing = placesParquing;
    }

    public boolean isTerrassa() {
        return terrassa;
    }

    public void setTerrassa(boolean terrassa) {
        this.terrassa = terrassa;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isAireFred() {
        return aireFred;
    }

    public void setAireFred(boolean aireFred) {
        this.aireFred = aireFred;
    }

}