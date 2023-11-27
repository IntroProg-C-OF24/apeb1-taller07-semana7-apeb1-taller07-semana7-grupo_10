package taller_07;
import java.util.Scanner;
public class Problem_06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float costoCompu, porcentaje01, porcentaje02;
        int tipoClient, i=1;
        String nomClien;
        while(i<=7){
            System.out.print("Nombre: ");
            nomClien = teclado.next();
            System.out.print("Precio de la Computadora: ");
            costoCompu = teclado.nextFloat();
            System.out.print("Tipo de Cliente: ");
            tipoClient = teclado.nextInt();
            porcentaje01 = (costoCompu * 10)/100;
            porcentaje02 = (costoCompu * 20)/100;
            if(tipoClient == 1){
                 System.out.println("Cliente tipo 1: "+nomClien+" compra computadora con precio "+(costoCompu-porcentaje01));  
            }else if(tipoClient == 2){
                System.out.println("Cliente tipo 2: "+nomClien+" compra computadora con precio "+(costoCompu-porcentaje02));                
            }else{
                System.out.println("Cliente: "+nomClien+" compra computadora con precio "+costoCompu);                
            }                    
            i=i+1;
        }
    }
    
}
