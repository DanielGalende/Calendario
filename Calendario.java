
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
        String fecha ="";
        fecha = ano + "-" + mes + "-" + dia;
        return fecha;
    }
    
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno){
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
    }
}