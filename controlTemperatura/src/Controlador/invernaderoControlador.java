
package Controlador;
import Modelo.invernaderoModelo;
import Vista.invernaderoVista;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class invernaderoControlador {
    
    private invernaderoModelo modelo;
    private invernaderoVista vista;

    public invernaderoControlador(invernaderoModelo modelo, invernaderoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void iniciarSistema(int ciclos){
        Random op = new Random();
        
        for(int i =0;i<ciclos;i++){
            double temperatura = 5 + op.nextDouble() * 30; // simular temperatura entre 5c y 35c
            String estado = modelo.controlarTemperatura(temperatura);
            vista.mostrarTemperatura(temperatura, estado);
            
            try {
                TimeUnit.SECONDS.sleep(5);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        vista.mostrarHistorial(modelo.getHistorial());//mostrar historial al final
        
    }
    
    
}


