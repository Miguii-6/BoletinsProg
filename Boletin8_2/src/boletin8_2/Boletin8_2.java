
package boletin8_2;

import javax.swing.JOptionPane;


public class Boletin8_2 {

    
    public static void main(String[] args) {
        Opcions obj = new Opcions();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecciona aa figura coa superficie que desexas calcular:\n1. Cuadrado\n2. Triángulo\n3. Círculo"));
        obj.opcions(opcion);
    }
    
}
