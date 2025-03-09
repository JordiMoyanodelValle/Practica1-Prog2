package prog2.model;
import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.*;
import java.util.ArrayList;

public class Camping implements InCamping{
    //Definim els atributs i el constructor
    private final String nom;
    private LlistaReserves llistaReserves;
    private ArrayList<Allotjament> llistaAllotjaments;
    private ArrayList<Client> llistaClients;

    public Camping (String nom) {
        this.nom = nom;
        this.llistaReserves = new LlistaReserves();
        this.llistaAllotjaments = new ArrayList<>();
        this.llistaClients = new ArrayList<>();
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

    public void afegirClient(String nom_, String dni_) throws ExcepcioReserva {
        Client client = new Client (nom_, dni_);
        this.llistaClients.add(client);

    }

    public void afegirParcela(String nom_, String IdAllotjament_, float metres, boolean connexioElectrica){
        Parcela parcela = new Parcela (nom_, IdAllotjament_, metres, connexioElectrica);
        this.llistaAllotjaments.add(parcela);
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
                                                            placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);
        this.llistaAllotjaments.add(BungalowPremium);
    }

    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                               String material, boolean casaMascota) {
        Glamping glamping = new Glamping(nom_, idAllotjament_, mida, habitacions, placesPersones, material, casaMascota);
        this.llistaAllotjaments.add(glamping);
    }

    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                                boolean terrassaBarbacoa) {
        MobilHome mobilHome = new MobilHome(nom_, idAllotjament_, mida, habitacions, placesPersones, terrassaBarbacoa);
        this.llistaAllotjaments.add(mobilHome);
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
        float midaTotal = 0;
        for (Allotjament allotjament : llistaAllotjaments) {
            if (allotjament instanceof Parcela) {
                Parcela parcela = (Parcela) allotjament;
                midaTotal = midaTotal + parcela.getMida();
            }
        }
        return midaTotal;
    }

    public int calculAllotjamentsOperatius() {
        int numAllotjaments = 0;
        for (Allotjament allotjament : llistaAllotjaments) {
            if (allotjament.correcteFuncionament()) numAllotjaments++;
        }
        return numAllotjaments;
    }
    public static InAllotjament.Temp getTemporada(LocalDate data){
        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();

        if ((mes > 3 && mes < 9) || (mes == 3 && dia >= 21) || (mes == 9 && dia < 21)) {
            return InAllotjament.Temp.ALTA;
        } else {
            return InAllotjament.Temp.BAIXA;
        }
    }
}

