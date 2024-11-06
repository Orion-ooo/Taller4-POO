
package local;

/**
 *
 * @author Daniel
 */
public class Ejercicio2_Moto extends Ejercicio2_Vehiculo{
    private int cilindrada;

    public Ejercicio2_Moto(int cilindrada, String tipo, String marca) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
