/**
 *
 * @/author nyyac
 */
public class Cuenta {
    private double saldo; 

    public Cuenta(double saldoInicial){
        if (saldoInicial > 0.0)
            saldo = saldoInicial;
        else
            saldo=saldoInicial;
    }

    public void abonar(double monto){
        saldo = saldo + monto;
    }
 public double obtenerSaldo(){
     return saldo;
 }
 public void cargar(double monto){
     if(monto > saldo){
         System.out.println("El monto a cargar excede el saldo de la cuenta");
         }
         else{
                 saldo-=monto;
                 }

 }
}
