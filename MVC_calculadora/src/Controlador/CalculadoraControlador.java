
package Controlador;
import Modelo.CalculadoraModelo;
import Vista.CalculadoraVista;
import java.util.ArrayList;


public class CalculadoraControlador {
    
    private  CalculadoraModelo modelo;
    private CalculadoraVista vista;

    public CalculadoraControlador(CalculadoraModelo modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    
    public void inicar(){
        boolean ejecutando=true;
        while(ejecutando){
            int opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    double num1 = vista.solicitarNumero("ingrese primer numero");
                    double num2 = vista.solicitarNumero("ingrese segundo numero");
                    String operador = vista.solicitarOperador();
                    double resultado = modelo.operar(num1, num2, operador);
                    if(!Double.isNaN(resultado)){
                        vista.mostrarResultado(resultado);
                        
                    }
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
    
    
}
