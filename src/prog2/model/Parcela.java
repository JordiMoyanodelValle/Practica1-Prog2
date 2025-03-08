package prog2.model;

public class Parcela extends Allotjament {

    private float metres;
    private boolean connexioElectrica;

    public Parcela (String nom, String idAllotjament, float metres , boolean conexioElectrica){
        super(nom, idAllotjament);
        this.metres = metres;
        this.connexioElectrica = conexioElectrica;
    }

    public float getMetres(){
        return metres;
    }

    public boolean getConexioElectrica(){
        return connexioElectrica;
    }

    public void setMetres(float metres){
        this.metres = metres;
    }

    public void setConexioElectrica(boolean con){
        this.connexioElectrica = con;
    }
}
