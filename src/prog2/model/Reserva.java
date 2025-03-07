package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;

public class Reserva {

    private Client client;
    private Allotjament allotjament;
    private LocalDate data;

    public Reserva(Client client, Allotjament allotjament, LocalDate data) {
        this.client = client;
        this.allotjament = allotjament;
        this.data = data;
    }

    public Allotjament getAllotjament() {
        return allotjament;
    }

    public void setAllotjament(Allotjament allotjament) {
        this.allotjament = allotjament;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
