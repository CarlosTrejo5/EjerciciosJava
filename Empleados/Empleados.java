/**
 *
 * @author nyyac
 */
public class Empleados {
    String nombre;
    String apellido;
    double salarioMensual;
    double salarioAnual;

    public Empleados(String n, String a, double sm){
        nombre = n;
        apellido = a;
        salarioMensual = sm;
    }
    public Empleados(){

    }
    public void setNombre(String n) {
        this.nombre = n;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        if(salarioMensual > 0)
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioAnual(){
        salarioAnual = salarioMensual*12;
        return salarioAnual;
    }

    public double NuevoSueldo(){
        return (salarioMensual + (salarioMensual *0.1)) * 12;
    }
}
