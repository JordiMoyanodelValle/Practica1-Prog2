package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;

public class Reserva {
    //Definim els atributs i el constructor (si te super es perque herencia d'una clase superior)
    private Client client;
    private Allotjament allotjament;
    private LocalDate dataEntrada;
    private LocalDate dataSortida;

    public Reserva(Client client, Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        this.client = client;
        this.allotjament = allotjament;
        this.dataEntrada = dataEntrada;
        this.dataSortida = dataSortida;
        if (dataEntrada.isAfter(dataSortida)){
            throw new ExcepcioReserva("La data d'entrada ha de ser anterior a la de sortida");
        }

    }
    //Fem tots els getters i setters
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

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate data) {
        this.dataEntrada = data;
    }

    public LocalDate getDataSortida() {
        return dataSortida;
    }

    public void setDataSortida(LocalDate data) {
        this.dataSortida = data;
    }

    public String toString() {
        return "La reserva del client "+ client.toString() + " és del allotjament " + allotjament.getNom() + " amb id " + allotjament.getId() +
                " és del dia " + dataEntrada + " fins al dia " + dataSortida + ".";
    }
}
