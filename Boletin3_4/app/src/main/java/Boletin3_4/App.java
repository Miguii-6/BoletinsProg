

package Boletin3_4;

import java.util.Scanner;


public class App {
   
    public static void main(String[] args) {
        Scanner obxScaner= new Scanner(System.in);
        
        System.out.println("teclea a cantidade: ");
        int cantidade =obxScaner.nextInt();
        
        int billetes_100 = cantidade/100;
        cantidade= cantidade- billetes_100*100;
        
        int billetes_20 = cantidade/20;
        cantidade= cantidade- billetes_20*20;
        
        int billetes_5 = cantidade/5;
        cantidade= cantidade- billetes_5*5;
        
        int monedas_1 = cantidade/1;
        cantidade= cantidade- monedas_1*1;
        
        System.out.println("Son "+billetes_100+" billetes de 100, son "+billetes_20+" billetes de 20, son "+billetes_5+" billetes de 5, son "+monedas_1+(" monedas de 1"));
        
        
        
    }
}
