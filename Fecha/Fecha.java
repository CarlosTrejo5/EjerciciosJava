/**
 *
 * @author nyyac
 */
public class Fecha {
    int dia;
    int mes;
    int año;

    public Fecha(){

    }
    public Fecha(int a, int m, int d){
        dia = d;
        mes = m;
        año = a;
    }
    public void setDia(int dia){
    this.dia = dia;
    }
    public int getDia(){
        return dia;
    }

    public void setMes(int mes){
    this.mes = mes;
    }
    public int getMes(){
        return mes;
    }

    public void setAño(int año){
    this.año = año;
    }
    public int getAño(){
        return año;
    }
    public void showFecha(){
        System.out.printf("%s %d/%d/%d", "Fecha: ",dia,mes,año);

    }
}
