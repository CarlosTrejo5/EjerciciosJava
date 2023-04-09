import java.util.*;
/**
 *
 * @author nyyac
 */
public class PruebaFecha {
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        Fecha fechas = new Fecha();
        System.out.print("Dia: ");
        int d = entrada.nextInt();
        System.out.print("Mes: ");
        int m = entrada.nextInt();
        System.out.print("Año: ");
        int a = entrada.nextInt();

        fechas.setDia(d);
        fechas.setMes(m);
        fechas.setAño(a);
        fechas.showFecha();
    }
}
