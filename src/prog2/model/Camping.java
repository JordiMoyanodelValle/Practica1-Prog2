package prog2.model;
import java.util.*;
import java.util.ArrayList;

public class Camping implements InCamping{
    private final String nom;
    private LlistaReserves llistaReserves;
    private ArrayList<Allotjament> llistaAllotjaments;
    private ArrayList<Client> llistaClients;

    public Camping (String nom) {
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }
    public LlistaReserves getLlistaReserves(){
        return this.llistaReserves;
    }
    public ArrayList<Allotjament> getLlistaAllotjaments(){
        return this.llistaAllotjaments;
    }
    public ArrayList<Client> getLlistaClients(){
        return this.llistaClients;
    }
    public int getNumAllotjaments(){
        return this.llistaAllotjaments.size();
    }
    public int getNumReserves(){
        return this.llistaReserves.getSize();
    }
    public int getNumClients(){
        return this.llistaClients.size();
    }
    public void afegirClient(String nom, String dni){
        Client client = new Client (nom, dni);
        this.llistaClients.add(client);

    }
    public void afegirParcela(String nom, String IdAllotjament, float metres, boolean connexióElectrica){
        Parcela parcela = new Parcela (nom, IdAllotjament, metres, connexióElectrica);
        llistaAllotjaments.add(parcela);
    }
    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                               int placesParquing, boolean terrassa, boolean tv, boolean aireFred){
        Bungalow bungalow = new Bungalow(nom_,idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        this.llistaAllotjaments.add(bungalow);
    }
    void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                               int placesParquing, boolean terrassa, boolean tv, boolean aireFred,
                               boolean serveisExtra, String codiWifi){
        BungalowPremium = new BungalowPremium()
    }
}


