
package Vista;
import java.util.List;

public class seguridadVista {
    public void mostrarEstado ( String mensaje){
        System.out.println(mensaje);
    }
    
    public void mostrarHistorial ( List<String> historial){
        System.out.println("\n historial de detecciones");
        for(String registro : historial){
            System.out.println(registro);
        }
    }
    
    public void mostrarMenu(){
        System.out.println("-------MENU-------");
        System.out.println("1. Activar alarma");
        System.out.println("2. Desactivar alarma");
        System.out.println("3. Simular detección de sensores");
        System.out.println("4. Mostrar historial");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
