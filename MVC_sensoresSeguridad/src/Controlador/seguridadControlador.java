
package Controlador;
import Modelo.seguridadModelo;
import Vista.seguridadVista;
import java.util.Scanner;

public class seguridadControlador {
    private seguridadModelo modelo;
    private seguridadVista vista;
    private Scanner ss;
    
    public seguridadControlador(seguridadModelo modelo,seguridadVista vista){
        this.modelo = modelo;
        this.vista = vista;
        this.ss =  new Scanner(System.in);
    }
    
    public void ejecutar(){
        boolean salir = false;
        while (!salir){
            vista.mostrarMenu();
            int opcion = ss.nextInt();
            
            switch (opcion) {
                case 1:
                    modelo.setAlarmaActiva(true);
                    vista.mostrarEstado("alarma activada");
                    break;
                    
                case 2:
                    modelo.setAlarmaActiva(false);
                    vista.mostrarEstado("alarma desactivada");
                    break;
                    
                case 3:
                    String resultado = modelo.verificarSensores();
                    vista.mostrarEstado(resultado);
                    break;
                    
                case 4: 
                    vista.mostrarHistorial(modelo.getHistorial());
                    break;
                    
                case 5:
                    vista.mostrarEstado("saliendo del sistema");
                    salir= true;
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        }
    }
}
