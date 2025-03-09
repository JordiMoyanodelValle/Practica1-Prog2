package prog2.model;
import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;


public class LlistaReserves implements InLlistaReserves {

    private ArrayList<Reserva> llistaReserves;
    public LlistaReserves(){
        this.llistaReserves = new ArrayList<>();
    }

    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        // Com hem ficat una funció per validar la estada a Allotjament.java , la fem servir aqui.
        allotjament.validarEstada(dataEntrada, dataSortida);
        if (dataEntrada == null || dataSortida == null){
            throw new ExcepcioReserva("Has de posar una data de entrada i una de sortida.");
        }
        else if (dataEntrada.isAfter(dataSortida) || dataEntrada.isEqual(dataSortida)) {
            throw new ExcepcioReserva("La data d'entrada ha de ser anterior a la data de sortida.");
        }
        else if (!allotjament.correcteFuncionament()){
            throw new ExcepcioReserva("Has d'escollir un allotjament amb un funcionament correcte.");

        }
        /* Aquest for el que fa es comprovar de totes les reserves, si hi ha alguna que sigui del mateix allotjament
        i comprovi si esta ocupat els dies que tu has ficat. Aleshores comprova tant si entras abans de que surti algu
        que ja tingui reserva o intentes sortir després de que entri algu que ja te reserva)
         */

        for (Reserva reserva : llistaReserves) {
            if( (reserva.getAllotjament().equals(allotjament)) && (reserva.getDataSortida().isAfter(dataEntrada) || reserva.getDataEntrada().isBefore(dataSortida)) ){
                throw new ExcepcioReserva("No està disponible, ja ha sigut reservada en la data demanada");
            }
        }
        Reserva novaReserva = new Reserva (client, allotjament, dataEntrada, dataSortida);
        llistaReserves.add(novaReserva);
    }

    public int getNumReserves() {
        return llistaReserves.size();
    }
    public ArrayList<Reserva> getReserves() {
        return llistaReserves;
    }
}