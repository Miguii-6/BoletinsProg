
package boletin7_5;

import javax.swing.JOptionPane;

public class Boletin7_5 {

    public static void main(String[] args) {
       int a = Integer.parseInt(JOptionPane.showInputDialog("inseerte o primeiro numero "));
       int b = Integer.parseInt(JOptionPane.showInputDialog("inseerte o segundo numero "));
       int c = Integer.parseInt(JOptionPane.showInputDialog("inseerte o terceiro numero "));
       
       TresNumeros obx = new TresNumeros();
       obx.maiorNumero(a, b, c);
        
    }
    
}
