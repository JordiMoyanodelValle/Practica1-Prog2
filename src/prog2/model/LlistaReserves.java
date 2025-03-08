package prog2.model;
import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;

public class LlistaReserves implements InLlistaReserves {

    private ArrayList<Reserva> llistaReserves;

    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {

    }

    public int getNumReserves() {
        return llistaReserves.size();
    }
}