
package mvc_sensoresseguridad;

import Controlador.seguridadControlador;
import Modelo.seguridadModelo;
import Vista.seguridadVista;


public class Principal {

    
    public static void main(String[] args) {
        seguridadModelo modelo = new seguridadModelo();
        seguridadVista vista = new seguridadVista();
        seguridadControlador controlador = new seguridadControlador(modelo, vista);
        controlador.ejecutar();
    }
}

