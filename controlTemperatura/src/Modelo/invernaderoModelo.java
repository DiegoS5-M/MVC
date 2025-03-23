
package Modelo;
import java.util.ArrayList;

public class invernaderoModelo {
    private ArrayList<String> historial;
    
    
    public invernaderoModelo(){
        historial = new ArrayList<>();
    }
    
    public String controlarTemperatura(double temperatura){
        String estado;
        if(temperatura<10){
            estado= "calefaccion activada";
        }
        else if(temperatura > 25){
            estado= "ventilador activo";
        }
        else{
            estado =" sistema inactivo";
        }
        
        historial.add("temperatura: " + temperatura + " °C = " + estado);    
        return estado;
}
    
    public ArrayList<String>getHistorial(){
        return historial;
    }
}