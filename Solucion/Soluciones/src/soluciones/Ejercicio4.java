package soluciones;
import java.util.Scanner;
public class Ejercicio4 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String reporteJugadores = "";
        int contador = 1;
        int totalEdades = 0;
        double totalEstaturas = 0;
        while (true) {
            System.out.print("Ingrese el nombre del jugador (o 'fin' para terminar): ");
            String nombre = teclado.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            System.out.print("Ingrese la posicion del jugador: ");
            String posicion = teclado.nextLine();
            System.out.print("Ingrese la edad del jugador: ");
            int edad = teclado.nextInt();
            totalEdades += edad;
            System.out.print("Ingrese la estatura del jugador: ");
            double estatura = teclado.nextDouble();
            totalEstaturas += estatura;
            teclado.nextLine();
            reporteJugadores += contador + ". " + nombre + " -" + posicion + "-, edad " + edad + ", estatura " + estatura + "\n";
            contador++;
        }
        if (contador > 1) {
            double promedioEdades = (double) totalEdades / (contador - 1);
            double promedioEstaturas = totalEstaturas / (contador - 1);
            reporteJugadores += "Promedio de edades: " + promedioEdades + "\n";
            reporteJugadores += "Promedio de estaturas: " + promedioEstaturas + "\n";
            System.out.println("\nListado de Jugadores\n" + reporteJugadores);
        } else {
            System.out.println("No se ingresaron jugadores.");
        }
    }    
}
