package prog2.model;

public class Casa extends Allotjament{

    private String mida;
    private int habitacions;
    private int capacitat;

    public Casa (String nom, String idAllotjament, String mida, int habitacions, int capacitat){
        super(nom, idAllotjament);
        this.mida = mida;
        this.habitacions = habitacions;
        this.capacitat = capacitat;
    }

    public String getMida() {
        return mida;
    }

    public int getHabitacions() {
        return habitacions;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setMida(String mida) {
        this.mida = mida;
    }

    public void setHabitacions(int habitacions) {
        this.habitacions = habitacions;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }
}