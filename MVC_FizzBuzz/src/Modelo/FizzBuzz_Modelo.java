
package Modelo;
import java.util.ArrayList;

public class FizzBuzz_Modelo {
    
    private ArrayList<String> resultados;
    
    public FizzBuzz_Modelo(){
        resultados = new ArrayList<>();
    }
    
    public void generarFizzBuzz(int limite){
        resultados.clear(); // limpia antes de generar valores
        
        for (int i = 0;i <= limite ; i++){
            if(i%3 == 0 && i % 5 == 0 ){
                resultados.add ("FizzBuzz");
            }
            else if (i%3==0){
                resultados.add("Fizz");
            }
            else if (i%5==0) {
                resultados.add("Buzz");
            }
            else{
                resultados.add(String.valueOf(i));
            }
        }
    }
    
    public ArrayList<String> getResultados(){
        return resultados; // devolvemos los valores generados
    }
    
}
