package prog2.model;
import java.util.ArrayList;
import java.util.*;

public class LlistaReserves implements InLlistaReserves {
    private ArrayList<Reserva> llistaReserves;

    public int getSize(){
        return llistaReserves.size();
    }
}
