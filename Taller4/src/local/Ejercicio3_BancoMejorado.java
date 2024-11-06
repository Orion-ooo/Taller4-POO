
package local;

/**
 *
 * @author Daniel
 */
public class Ejercicio3_BancoMejorado {
    private double saldo;

    public Ejercicio3_BancoMejorado(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("cantidad no valida para depositar");
        }
    }
    
    public double obtenerSaldo() {
        return saldo;
    }
}
