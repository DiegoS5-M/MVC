
package Controlador;

import Modelo.FizzBuzz_Modelo;
import Vista.FizzBuzz_Vista;

public class FizzBuzz_Controlador {
    private FizzBuzz_Modelo modelo;
    private FizzBuzz_Vista vista;
    
    public FizzBuzz_Controlador(FizzBuzz_Modelo modelo,FizzBuzz_Vista vista){
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void ejecutarFizzBuzz(int limite){
        modelo.generarFizzBuzz(limite);
        vista.mostrarResultados(modelo.getResultados());
    }
}
