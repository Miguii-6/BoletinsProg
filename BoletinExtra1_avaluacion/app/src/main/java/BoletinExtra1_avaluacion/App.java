
package BoletinExtra1_avaluacion;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        Scanner obxScaner= new Scanner(System.in);
        float porcentaxe, total;
        System.out.println("Excreibe a base: ");
        float base =obxScaner.nextFloat();
        
        System.out.println("Excreibe o IVE: ");
        float ive =obxScaner.nextFloat();
        
        porcentaxe= base*(ive/100);
        total = base + porcentaxe;
        
        System.out.println("Pagas " +total+ " en euros,mais o que pagaches en IVE " + porcentaxe);
        
    }
}
