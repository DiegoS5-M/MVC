
package Modelo;
import java.util.ArrayList;

public class Sala_Modelo {
    
    
    private ArrayList<Asiento>asientos;
    
    public Sala_Modelo(int capacidad){
        this.asientos = new ArrayList<>();
        for(int i = 0;i<capacidad;i++){
            asientos.add(new Asiento());
        }
    }
    
    public boolean reservarAsiento(int numero){
        if(numero >= 0 && numero < asientos.size() && !asientos.get(numero).estaReservado()){
            asientos.get (numero).reservar();
            return true;
        }
        return false;
    }
    
    public void mostrarAsientos(){
        System.out.println("Estado de asientos");
        for(int i = 0; i < asientos.size();i++){
            System.out.print(asientos.get(i).estaReservado() ? "[x]" : "[ ]");
        }
        System.out.println();
    }
    
    public boolean hayAsientosDisponibles(){
        for(Asiento a : asientos){
            if(!a.estaReservado()) 
                return true;
        }
        return false;
    }
    
    public int getCapacidad(){
        return asientos.size();
    }
    
}
