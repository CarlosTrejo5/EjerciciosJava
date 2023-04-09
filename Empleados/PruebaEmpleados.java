import java.util.*;
/**
 *
 * @author nyyac
 */
public class PruebaEmpleados {
    public static void main (String []args){

        Empleados empleado1 = new Empleados("Carlos","Trejo", 8000.00);

        System.out.printf("Su nombre es: " + empleado1.getNombre());
        System.out.printf("\nEl apellido ingresado es: " + empleado1.getApellido());
        System.out.printf("\nEl salario anual es el siguiente: " + empleado1.getSalarioAnual());

        Empleados empleados2 = new Empleados();
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\nPor favor ingrese su primer nomnbre: \n");
        String nombre = entrada.nextLine();
        empleados2.setNombre(nombre);
        System.out.println("Ingrese su apellido paterno: \n");
        String apellido = entrada.nextLine();
        empleados2.setApellido(apellido);
        System.out.println("¿Que salario mensual desea ingresar? \n");
        double salarioMensual = entrada.nextDouble();
        empleados2.setSalarioMensual(salarioMensual);
        System.out.printf("\n\nSu nombre es: \n" + empleados2.getNombre());
        System.out.printf("\nEl apellido ingresado es: \n" + empleados2.getApellido());
        System.out.printf("\nEl salario anual es el siguiente: \n" + empleados2.getSalarioAnual());

        System.out.print("\n\nFelicidades a tenido un aumento del 10%: \n");
        System.out.printf("\nEste es el salario con aumento del 1er registro: \n" + empleado1.NuevoSueldo());
        System.out.printf("\nEste es el salario con aumento del 2do registro: \n" + empleados2.NuevoSueldo());
    }
}
