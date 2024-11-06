
package local;

/**
 *
 * @author Daniel
 */
public class Ejercicio1_Empleado {
    protected String nombre;
    protected double salario;

    public Ejercicio1_Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    //metodo para mostrar la informacion
    
    protected void mostrarInformacion(){
        System.out.println("nombre: " + nombre + ", salario: " + salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
