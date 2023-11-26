package soluciones;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
    int  contador=1; String nombre; int numDias; double costDia;double total;
    Scanner teclado = new Scanner(System.in);
    while (contador <= 4){
        System.out.println("Ingrese el nombre de los empleados: ");
        nombre = teclado.next();
        System.out.println("Ingrese el numero de dias trabajados: ");
        numDias = teclado.nextInt();
        System.out.println("Ingrese el costo de trabajo por dia: ");
        costDia = teclado.nextDouble();
        total = costDia * numDias;
        System.out.println("-------------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Numero de dias trabajados: "+numDias);
        System.out.println("Ingresos por dias trabajados: "+costDia);
        System.out.println("Ingresos totales: "+total);
        System.out.println("-------------------------------");
        contador++;
    }
        
        
   }   
 }
    
    

