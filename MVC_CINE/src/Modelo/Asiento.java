
package Modelo;


public class Asiento {
    
    private boolean reservado ;
    
    public Asiento(){
        this.reservado = false;
        
    }
    
    public boolean estaReservado(){
        return reservado;
        
    }
    
    public void reservar(){
        this.reservado = true;
        
    }
    
    public void cancelarReserva(){
        this. reservado = false;
    }
    
    
}
