
package mvc_cine;

import Controlador.Sala_Controlador;
import Modelo.Sala_Modelo;
import Vista.Sala_Vista;


public class Principal {
    public static void main(String[] args) {
        Sala_Modelo sala = new Sala_Modelo(10);
        Sala_Vista vista = new Sala_Vista();
        Sala_Controlador controlador = new Sala_Controlador(sala, vista);
        
        controlador.iniciar();
       
    }
    
}
