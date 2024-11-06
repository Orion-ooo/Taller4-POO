
package local;

/**
 *
 * @author Daniel
 */
public class Ejercicio2_Vehiculo {
    protected String tipo;
    protected String marca;

    protected Ejercicio2_Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
        
}
