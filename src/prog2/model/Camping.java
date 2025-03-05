package prog2.model;
import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
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
        return this.llistaReserves.getNumReserves();
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
        Bungalow bungalow = new Bungalow(nom_,idAllotjament_, mida, habitacions, placesPersones, placesParquing,
                                        terrassa, tv, aireFred);
        this.llistaAllotjaments.add(bungalow);
    }

    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                                      int placesParquing, boolean terrassa, boolean tv, boolean aireFred,
                                      boolean serveisExtra, String codiWifi){
        BungalowPremium BungalowPremium = new BungalowPremium(nom_, idAllotjament_, mida, habitacions, placesPersones,
                                                            placesParquing, terrassa, tv, aireFred);
    }

    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                               String material, boolean casaMascota) {
        Glamping glamping = new Glamping(nom_, idAllotjament_, mida, habitacions, placesPersones, material, casaMascota);
    }

    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                                boolean terrassaBarbacoa) {
        MobilHome mobilHome = new MobilHome(nom_, idAllotjament_, mida, habitacions, placesPersones, terrassaBarbacoa);
    }

    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        /* Primer trobem el client segons el seu dni */
        Client client = null;
        for (Client client1 : llistaClients) {
            if (client1.getDni().equals(dni_))  {
                client = client1;
                break;
            }
        }
        if (client == null) {
            throw new ExcepcioReserva("No es pot fer la reserva perquè no s'ha trobat el client amb DNI: " + dni_);
        }

        /* En segon lloc, trobem l'allotjament segons el seu id */
        Allotjament allotjament = null;
        for (Allotjament allotjament1 : llistaAllotjaments) {
            if (allotjament1.getId().equals(id_))  {
                allotjament = allotjament1;
                break;
            }
        }
        if (allotjament == null) {
            throw new ExcepcioReserva("No es pot fer la reserva perquè no s'ha trobat l'allotjament amb ID: " + id_);
        }

        llistaReserves.afegirReserva(allotjament, client, dataEntrada, dataSortida);

    }

    public float calculMidaTotalParceles() {
        return 0;
    }

    public int calculAllotjamentsOperatius() {
        return 0;
    }

    public Allotjament getAllotjamentEstadaMesCurta() {
        return null;
    }
}