import java.util.*;
/**
 *
 * @author nyyac
 */
public class PruebaLibroCalificaciones {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
        System.out.printf("El nombre inicial del curso es: %s\n\n", miLibroCalificaciones.obtenerNombreDelCurso());
        System.out.println("Escriba el nombre del curso:\n\n");
        String elNombre = entrada.nextLine();
        miLibroCalificaciones.establecerNombreDelCurso(elNombre);
        System.out.println();
        miLibroCalificaciones.mostrarMensaje();
        System.out.printf("%s\n\n",  miLibroCalificaciones.obtenerNombreDelInstructor());
        System.out.println("Escriba el nombre del instructor:\n\n");
        String elInstructor = entrada.nextLine();
        miLibroCalificaciones.establecerNombreDelInstructor(elInstructor);
        System.out.println();
        miLibroCalificaciones.mostrarMensaje();
    }
}
