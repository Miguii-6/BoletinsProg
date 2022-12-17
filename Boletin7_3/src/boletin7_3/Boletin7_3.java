
package boletin7_3;

import javax.swing.JOptionPane;

public class Boletin7_3 {

    
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("inseerte un numero "));
       Signos obx = new Signos();
       obx.mirarNumero(num);
    }
    
}
