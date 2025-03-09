package prog2.model;

public class Parcela extends Allotjament {
    //Definim els atributs i el constructor (si te super es perque herencia d'una clase superior)
    private float metres;
    private boolean connexioElectrica;


    public Parcela (String nom, String idAllotjament, float metres , boolean conexioElectrica){
        super(nom, idAllotjament, 4, 2);
        this.metres = metres;
        this.connexioElectrica = conexioElectrica;
    }
    //Fem tots els getters i setters
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
