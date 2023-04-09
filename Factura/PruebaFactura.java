import java.util.*;
/**
 *
 * @author nyyac
 */
public class PruebaFactura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Factura miFactura = new Factura("245", "turbo compresor", 4, 100, 20580.00);

        System.out.printf("El numero de su pieza es: \n"+ miFactura.getNo_pza());
        System.out.printf("\nLa descripcion del articulo es: \n"+ miFactura.getDescripcion());
        System.out.printf("\nLa cantidad de articulos que desea comprar es: \n" + miFactura.getCantidad());
        System.out.printf("\nEl precio del ariticulo individual es: \n" + miFactura.getPrecio());
        System.out.printf("\nEl costo total de su compra es: \n" + miFactura.getMonto());

        System.out.printf("\nIngrese el numero de la pieza: \n");
        String no_pza = entrada.nextLine();
        miFactura.setNo_pza(no_pza);

        System.out.printf("\n¿Que descripcion de pieza o articulo es?: \n");
        String descripcion = entrada.nextLine();
        miFactura.setDescripcion(descripcion);

        System.out.printf("\n¿Que cantidad desea agregar?: \n");
        int cantidad = entrada.nextInt();
        miFactura.setCantidad(cantidad);

        System.out.printf("\n¿Cual es el precio de la pieza?: \n");
        double precio = entrada.nextDouble();
        miFactura.setPrecio(precio);

        miFactura.getMonto();

        System.out.print("\nEl numero de pieza es: \n"+ miFactura.getNo_pza());
        System.out.print("\nDescripcion de la pieza es: \n"+ miFactura.getDescripcion());
        System.out.print("\nCantidad de articulos por comprar es: \n" + miFactura.getCantidad());
        System.out.print("\nPrecio del articulo es de: \n" + miFactura.getPrecio());
        System.out.print("\nPrecio de su compra es de: \n\n" + miFactura.getMonto());
    }
}
