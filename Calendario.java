
/**
 * Write a description of class Calendario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calendario
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int ano;

    /**
     * Constructor for objects of class Calendario
     */
    public Calendario(){
        dia = 01;
        mes = 01;
        ano = 01;
        
    }
    
    public String obtenerFecha(){
        String otroDia = dia + "";
        String otroMes = mes + "";
        String otroAno = ano + "";
        String fecha ="";
        if (dia < 10){
            otroDia = "0" + dia;
        }
        
        if (mes < 10){
            otroMes = "0" + mes;
        }
        
        if (ano < 10){
            otroAno = "0" + ano;
        }
        fecha = otroAno + "-" + otroMes + "-" + otroDia;
        return fecha;
    }
    
    public void avanzarFecha(){
        dia = dia + 1;
        if (dia > 30){
            dia = 1;
            mes =  1 + mes;
        }
        
        if(mes > 12){
            mes = 1;
            ano = 1 + ano;
        }
        
        if (ano > 99){
            ano = 1;
        }
    }
    
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno){
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
    }
}
