
package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {
    public static final int MILLAS=1852;

    public static void main(String[] args) {
        //Pasar de millas mariñas a metross
        Scanner obxScaner= new Scanner(System.in);
        
        
        System.out.println("teclea os metros");
        double metros =obxScaner.nextFloat();
        
        double cambio = metros*MILLAS;
        System.out.println("Equivale a = " +cambio+ (" metros"));
    }
    
}
