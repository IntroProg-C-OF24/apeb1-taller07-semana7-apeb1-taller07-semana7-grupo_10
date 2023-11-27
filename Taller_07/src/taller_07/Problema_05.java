package taller_07;
import java.util.Scanner;
public class Problema_05 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         String nomEstu;
         int i = 1;
         float promedio;
         while(i<=4){
             System.out.println("Ingrese el nombre del estudiante "+i);
             nomEstu = teclado.next();
             System.out.println("Ingrese el promedio");
             promedio = teclado.nextFloat();
             if((promedio <= 10) && (promedio >= 7))
                 System.out.println(" | "+nomEstu+" | "+promedio+" | Aprobado |");
             else
                 System.out.println(" | "+nomEstu+" | "+promedio+" | Reprobado |");
             i=i+1;
         }
         
    }
    
}
