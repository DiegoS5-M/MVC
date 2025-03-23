
package MVC_controltemperatura;

import Controlador.invernaderoControlador;
import Modelo.invernaderoModelo;
import Vista.invernaderoVista;


public class Principal {

 
    public static void main(String[] args) {
        invernaderoModelo modelo= new invernaderoModelo();
        invernaderoVista vista = new invernaderoVista();
        invernaderoControlador controlador = new invernaderoControlador(modelo, vista);
        
        controlador.iniciarSistema(5);
        
    }
    
}
