/**
 *
 * @author nyyac
 */
public class LibroCalificaciones { // Clase
    private String nombreDelCurso; //Variable o nombre del curso para la clase LibroCalificaciones
    private String nombreDelInstructor; //Nombre del instructor para la clase LibroCalificaciones
    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso=nombre;
    }
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }
    public void establecerNombreDelInstructor(String instructor) {
        nombreDelInstructor=instructor;
    }
    public String obtenerNombreDelInstructor() {
        return nombreDelInstructor;
    }
    public void mostrarMensaje() {
        System.out.printf("Bienvenido al libro de calificacones para\n%s!\n",obtenerNombreDelCurso());
        System.out.printf("Este curso es presentado por:\n%s!\n", obtenerNombreDelInstructor());
    }
}
