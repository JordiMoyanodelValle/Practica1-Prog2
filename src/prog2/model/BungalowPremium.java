package prog2.model;

public class BungalowPremium extends Bungalow{
    private boolean llençols;
    private boolean tovalloles;
    private String Wifi;

    public BungalowPremium(String nom, String id, String mida, int habitacions, int capacitat, int placesParking,
                           boolean terrasa, boolean tv, boolean aireFred, boolean llençols , boolean tovalloles, String Wifi) {
        super(nom, id, mida, habitacions, capacitat, placesParking, terrasa, tv, aireFred);
        this.llençols = llençols;
        this.tovalloles = tovalloles;
        this.Wifi = Wifi;
    }

    public

}
