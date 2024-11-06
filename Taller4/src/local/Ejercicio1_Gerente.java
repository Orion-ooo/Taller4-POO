
package local;

/**
 *
 * @author Daniel
 */
public class Ejercicio1_Gerente extends Ejercicio1_Empleado{
    private String departamento;

    public Ejercicio1_Gerente(String departamento, String nombre, double salario) {
        super(nombre, salario);
        this.departamento = departamento;
    }
    
    //sobre escribiendo un metodo para mostrar toda la informacion del empleado y el gerente
    @Override public void mostrarInformacion(){
    System.out.println("nombre: " + nombre + ", salario: " + salario + " y departamento asignado: " + departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
