/**
 *
 * @author nyyac
 */
public class Factura {
    private String no_pza;
    private String descripcion;
    private int cantidad;
    private double precio;
    private double monto;


    public Factura(String pza, String d, int cant, double p, double m){
        no_pza = pza;
        descripcion = d;
       cantidad = cant;
        precio = p;
        monto = m;
    }

    public void setNo_pza(String pza) {
        this.no_pza = pza;
    }
    public String getNo_pza() {
        return no_pza;
    }

    public void setDescripcion(String d) {
        this.descripcion = d;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setCantidad(int cant) {
        this.cantidad = cant;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(double p) {
        this.precio = p;
    }
    public double getPrecio() {
        return precio;
    }
    public void setMonto(){
        monto = cantidad*precio;
    }
    public double getMonto() {
        return this.monto;
    }
}
