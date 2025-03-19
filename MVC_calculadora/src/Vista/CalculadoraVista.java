
package Vista;

import java.util.Scanner;
public class CalculadoraVista {
    
    private Scanner op;
    
    public CalculadoraVista(){
        op = new Scanner(System.in);
    }
    
    public double solicitarNumero(String mensaje){
        System.out.println(mensaje);
        return op.nextDouble();
    }
    
    public String solicitarOperador(){
        System.out.println("+ - * /");
        return op.next();
    }
    
    public void mostrarResultado(double resultado){
        System.out.println("resultado : " + resultado);
    }
    
    public void mostrarHistorial(String[] historial){
        System.out.println("\n historial de operaciones");
        //String operacion almacena cada operacion realizada
        //: historial recorre cada elemento que tenga el array
        for(String operacion : historial){
            System.out.println(operacion); // imprime cada operacion realizada
        }
    }
    
    public int mostrarMenu(){
        System.out.println("\nmenu");
        System.out.println("1.realizar operacion");
        System.out.println("2.mostrar historial operaciones");
        System.out.println("3.salir de la calculadora");
        System.out.println("seleccione opcion");
        return op.nextInt();
    }
            
    
}
