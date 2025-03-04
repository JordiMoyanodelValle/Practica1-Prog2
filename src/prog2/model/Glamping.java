package prog2.model;

public class Glamping extends Casa{
    private String material;
    private boolean casaMascotas;
    public Glamping(String nom, String idAllotjament, String mida, int habitacions, int capacitat, String material, boolean casaMascotas) {
        super(nom, idAllotjament, mida, habitacions, capacitat);
        this.material = material;
        this.casaMascotas = casaMascotas;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public boolean isCasaMascotas() {
        return casaMascotas;
    }
    public void setCasaMascotas(boolean casaMascotas) {
        this.casaMascotas = casaMascotas;
    }

}
