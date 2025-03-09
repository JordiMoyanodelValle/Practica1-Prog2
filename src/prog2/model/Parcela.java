package prog2.model;

public class Parcela extends Allotjament {

    private float metres;
    private boolean connexioElectrica;


    public Parcela (String nom, String idAllotjament, float metres , boolean conexioElectrica){
        super(nom, idAllotjament, 4, 2);
        this.metres = metres;
        this.connexioElectrica = conexioElectrica;
    }

    public float getMida(){
        return metres;
    }

    public boolean isConnexioElectrica(){
        return connexioElectrica;
    }

    public void setMida(float metres){
        this.metres = metres;
    }

    public void setConnexioElectrica(boolean con){
        this.connexioElectrica = con;
    }

}
