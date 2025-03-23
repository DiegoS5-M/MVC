
package Modelo;
import java.util.ArrayList;
import java.util.Random;

public class seguridadModelo {
    
    private boolean alarmaActiva;
    private boolean esDeNoche;
    private ArrayList<String> historial;
    
    
    public seguridadModelo(){
        this.alarmaActiva = true;//acctiva por defecto
        this.esDeNoche = true; // asumi que es de noche
        this.historial = new ArrayList<>();
        
    }
    
    public void setAlarmaActiva ( boolean estado){
        this.alarmaActiva = estado;
    }
    
    public boolean estaAlarmaActiva(){
        return alarmaActiva;
    }
    
    public boolean esNoche(){
        return esDeNoche;
    }
    
    public String verificarSensores(){
        Random op = new Random();
        int sensoresDetectando = 0;
        
        for (int i=0; i < 3; i++){
        if(op.nextBoolean()){
            sensoresDetectando++;
        }
    }
        
        String estado;
        if(alarmaActiva && esDeNoche && sensoresDetectando >= 2){
            estado = " alarma activada";
        }
        else {
            estado = "sistema en calma";
        }
        
        String registro = "sensores activados: " + sensoresDetectando + " | " + estado;
        historial.add(registro);
        return registro;
    }
    
    public ArrayList<String> getHistorial(){
        return historial;
    }
    
}

