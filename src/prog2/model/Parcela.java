package prog2.model;

public class Parcela extends Allotjament {

    private float metres;
    private boolean connexióElectrica;

    public Parcela (String nom, String idAllotjament, float metres , boolean conexióElectrica){
        super(nom, idAllotjament);
        this.metres = metres;
        this.connexióElectrica = conexióElectrica;
    }

    public float getMetres(){
        return metres;
    }

    public boolean getConexioElectrica(){
        return connexióElectrica;
    }

    public void setMetres(float metres){
        this.metres = metres;
    }

    public void setConexióElectrica(boolean con){
        this.connexióElectrica = con;
    }
}
