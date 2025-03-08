
package prog2.vista;

/**
 *
 * @author lauraigual
 */
public class   ExcepcioReserva extends Exception {

    public ExcepcioReserva(String message) {
        super(message);
    }

    public ExcepcioReserva() {
        super("S'ha produit un error en la reserva.");
    }
    
}
