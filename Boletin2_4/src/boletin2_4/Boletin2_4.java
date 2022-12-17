
package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {
        // Suma, resta, producto e cociente de dous numeros
         Scanner obxScaner= new Scanner(System.in);
       
       System.out.println("teclea o primeiro numero");
       float num1=obxScaner.nextFloat();
       
       System.out.println("teclea o segundo numero");
       float num2= obxScaner.nextFloat();
       
       float suma = num1+num2;
       float resta = num1-num2;
       float producto = num1*num2;
       float cociente = num1/num2;
       
       System.out.println(" Suma= " +suma+ "\n resta="+resta+ "\n producto= "+producto+ "\n cociente= "+cociente);
    }
    
}
