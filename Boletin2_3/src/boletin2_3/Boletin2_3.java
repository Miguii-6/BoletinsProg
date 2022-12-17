
package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {
        // Cambio de euros a dolares
        Scanner obxScaner= new Scanner(System.in);
        
        System.out.println("teclea os euros");
        double euros =obxScaner.nextFloat();
       
        System.out.println("teclea precio do dolar");
        double precioDolar =obxScaner.nextFloat();
       
        double cambio = euros*precioDolar;
        System.out.println("O cambio = " +cambio);
    }
    
}
