package prog2.model;

import prog2.vista.ExcepcioReserva;

public class Client {

    private String nom_;
    private String dni_;

    Client(String nom , String dni){
        this.nom_ = nom;
        if (dni.length() == 9) {
            this.dni_ = dni;
        }
        else {
            throw new ExcepcioReserva();
        }
    }
}