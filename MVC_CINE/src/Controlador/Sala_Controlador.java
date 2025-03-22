
package Controlador;

import Modelo.Sala_Modelo;
import Vista.Sala_Vista;




public class Sala_Controlador {
    private Sala_Modelo sala;
    private Sala_Vista vista;
    
    public Sala_Controlador(Sala_Modelo sala, Sala_Vista vista){
        this.sala = sala;
        this.vista = vista;
    }
    
    public void iniciar(){
        while (sala.hayAsientosDisponibles()){
            sala.mostrarAsientos();
            int numero = vista.pedirNumeroAsientos();
            
            if(sala.reservarAsiento(numero)){
                vista.mostrarMensaje("Asiento reservado con exito");
                
            }
            else {
                vista.mostrarMensaje("Asiento no disponible");
            }
            
           if(!vista.preguntarOtraReserva()){
               break;
           }
        }
        
        vista.mostrarMensaje("gracias por usar el sistema de reservas");
    }
    
    
}
