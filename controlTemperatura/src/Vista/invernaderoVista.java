
package Vista;


public class invernaderoVista {
    public void mostrarTemperatura(double temperatura, String estado){
        System.out.println("temperatura actual: " + temperatura + "°C");
        System.out.println("estado del Sistema: " + estado);
        System.out.println("______________________");
    }
    
    public void mostrarHistorial(java.util.List<String> historial){
        System.out.println("\n historial de temperatura");
        for(String registro : historial){
            System.out.println(registro);
        }
    }
}
