package prog2.model;

public class Casa extends Allotjament{
    private String nom;
    private String IdAllotjament;
    private String mida;
    private int habitacions;
    private int capacitat;
    public Casa (String nom, String IdAllotjament, String mida, int habitacions, int capacitat){
        this.nom = nom;
        this.IdAllotjament = IdAllotjament;
        this.mida = mida;
        this.habitacions = habitacions;
        this.capacitat = capacitat;
    }
    public String getNom() {
        return nom;
    }
    public String getIdAllotjament() {
        return IdAllotjament;
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
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setIdAllotjament(String idAllotjament) {
        IdAllotjament = idAllotjament;
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
