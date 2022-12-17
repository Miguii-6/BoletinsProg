
package boletin7_1;


import javax.swing.JOptionPane;

public class Boletin7_1 {

    
    public static void main(String[] args) {
        String res =JOptionPane.showInputDialog("Teclea o numero");
        int posi = Integer.parseInt(res);
        
        Positvo obx = new Positvo();
        obx.positivo(posi);
    }
    
}
