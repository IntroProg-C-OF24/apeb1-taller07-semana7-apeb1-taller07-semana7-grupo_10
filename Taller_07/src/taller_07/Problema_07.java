package taller_07;
public class Problema_07 {
    public static void main(String[] args) {
        int i=1, numA=-1, numB=1, sumatoria=0;
        while(i <= 10){
            System.out.println(numA+"/"+numB);
            sumatoria = sumatoria + (numA/numB);
            numA = numA*(-1);
            numB = numB +1;
            i = i + 1;
        }
        System.out.println("La sumatoria es: "+sumatoria);
        
    }
    
}
