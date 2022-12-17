
package Boletin3_2;

import java.util.Scanner;

public class App {
    public static final double KELVIN= 273.15;
    

    public static void main(String[] args) {
        Scanner obxScaner= new Scanner(System.in);
        
        System.out.println("teclea os graos Celsius");
       double celsius =obxScaner.nextFloat();
       
       double kelvin = celsius+KELVIN;
       double fahrenheit= (celsius*9/5)+32;
       
       System.out.println("A temperatura en Kelvin= "+kelvin+ (" e a temperatura en Fahrenheit= "+fahrenheit));
        
    }
}
