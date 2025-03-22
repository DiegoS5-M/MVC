
package Vista;
import java.util.Scanner;

public class Sala_Vista {
    private Scanner op;
    
    public Sala_Vista(){
        this.op = new Scanner(System.in);
    }
    
    public int pedirNumeroAsientos(){
        System.out.println("ingrese el numero a reservar");
        return op.nextInt();
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
   public boolean preguntarOtraReserva(){
       System.out.println("desea hacer otra reserva (s/n): ");
       String respuesta = op.next();
       return respuesta.equalsIgnoreCase("s");
       
   }
}
