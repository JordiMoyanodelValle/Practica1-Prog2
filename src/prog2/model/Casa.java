package prog2.model;

public class Casa extends Allotjament{

    private String mida;
    private int habitacions;
    private int placesPersones;
    private long estadaMinimaALTA;
    private long estadaMinimaBAIXA;

    public Casa (String nom, String idAllotjament, String mida, int habitacions, int placesPersones, long estadaMinimaALTA, long estadaMinimaBAIXA) {
        super(nom, idAllotjament, estadaMinimaALTA, estadaMinimaBAIXA);
        this.mida = mida;
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
        this.estadaMinimaALTA = estadaMinimaALTA;
        this.estadaMinimaBAIXA = estadaMinimaBAIXA;
    }

    public String getMida() {
        return mida;
    }

    public int getHabitacions() {
        return habitacions;
    }

    public int getPlacesPersones() {
        return placesPersones;
    }

    public void setMida(String mida) {
        this.mida = mida;
    }

    public void setHabitacions(int habitacions) {
        this.habitacions = habitacions;
    }

    public void setPlacesPersones(int capacitat) {
        this.placesPersones = capacitat;
    }

    public void setEstadaMinimaALTA(long estadaMinimaALTA) {
        this.estadaMinimaALTA = estadaMinimaALTA;
    }
    public long getEstadaMinimaALTA() {
        return estadaMinimaALTA;
    }
}