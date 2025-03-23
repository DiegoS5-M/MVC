
package mvc_fizzbuzz;

import Controlador.FizzBuzz_Controlador;
import Modelo.FizzBuzz_Modelo;
import Vista.FizzBuzz_Vista;


public class Principal {

   
    public static void main(String[] args) {
        FizzBuzz_Modelo modelo = new FizzBuzz_Modelo();
        FizzBuzz_Vista vista = new FizzBuzz_Vista();
        FizzBuzz_Controlador controlador= new FizzBuzz_Controlador(modelo, vista);
        
        controlador.ejecutarFizzBuzz(100);
    }
    
}
