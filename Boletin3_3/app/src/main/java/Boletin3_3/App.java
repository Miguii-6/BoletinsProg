
package Boletin3_3;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        Scanner obxScaner= new Scanner(System.in);
        int resultado;
        
        System.out.println("teclea os billetes de 100: ");
        int billetes_100 =obxScaner.nextInt();
        System.out.println("teclea os billetes de 20: ");
        int billetes_20=obxScaner.nextInt();
        System.out.println("teclea os billetes de 5: ");
        int billetes_5 =obxScaner.nextInt();
        System.out.println("teclea as monedas de 1: ");
        int monedas_1 =obxScaner.nextInt();
        
       resultado= 100* billetes_100 + 20*billetes_20 + 5*billetes_5 + 1*monedas_1;
       
       System.out.println("o diñeiro total= " +resultado+ ("euros") );
       
      
    }
}
