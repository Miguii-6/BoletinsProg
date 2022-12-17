
package boletin7_2;

import javax.swing.JOptionPane;


public class Boletin7_2 {

    
    public static void main(String[] args) {
        String res =JOptionPane.showInputDialog("Teclea o dato a");
        String log =JOptionPane.showInputDialog("Teclea o dato b");
        int a = Integer.parseInt(res);
        int b = Integer.parseInt(log);
        
        SumaResta obx = new SumaResta();
        obx.SiesSumaoResta((short) a,(short) b);
        
    }
    
}
