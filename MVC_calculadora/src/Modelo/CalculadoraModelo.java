
package Modelo;

import java.util.ArrayList;
public class CalculadoraModelo {
     private ArrayList<String> historial;

    public CalculadoraModelo() {
        historial = new ArrayList<>();
    }
    
    public double operar(double num1 , double num2 , String operador){
        double resultado = 0;
        
        switch (operador) {
            case "+" :
                
                resultado = num1 + num2;
                break;
                
            case "-" : 
                 
                resultado = num1 - num2;
                break;
                
            case "*" :
                
                resultado = num1 * num2;
                break;
                
            case "/" :
                if(num2!=0){
                    resultado = num1 / num2;
                }
                    else{
                            System.out.println("no se puede dividir por cero");
                                return Double.NaN;
                            }
                    
                break; 
            default:
                System.out.println("operador no valido");
        }
        historial.add(num1  + " " + num2 + " = " + resultado);
        return resultado;
    }
    
    public ArrayList<String> getHistorial(){
        return historial;
    }
    
    
    
}
