package prog2.model;

public class BungalowPremium extends Bungalow{

    private boolean llencols;
    private boolean tovalloles;
    private String wifi;

    public BungalowPremium(String nom, String id, String mida, int habitacions, int capacitat, int placesParking,
                           boolean terrasa, boolean tv, boolean aireFred, boolean llencols, boolean tovalloles, String wifi) {
        super(nom, id, mida, habitacions, capacitat, placesParking, terrasa, tv, aireFred);
        this.llencols = llencols;
        this.tovalloles = tovalloles;
        this.wifi = wifi;
    }

    public boolean isLlencols() {
        return llencols;
    }

    public void setLlencols(boolean llencols) {
        this.llencols = llencols;
    }

    public boolean isTovalloles() {
        return tovalloles;
    }

    public void setTovalloles(boolean tovalloles) {
        this.tovalloles = tovalloles;
    }

    public String getWifi () {
        return wifi;
    }

    public void setWifi (String wifi) {
        this.wifi = wifi;
    }

}