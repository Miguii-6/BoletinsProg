
package boletin7_4;

import javax.swing.JOptionPane;

public class Boletin7_4 {

    public static void main(String[] args) {
       String nome1 = JOptionPane.showInputDialog("inseerte o nome da primeira persoa ");
       String nome2 = JOptionPane.showInputDialog("inseerte o nome da segunda persoa ");
       int peso1 = Integer.parseInt(JOptionPane.showInputDialog("inseerte o peso da primeira persoa "));
       int peso2 = Integer.parseInt(JOptionPane.showInputDialog("inseerte o peso da segunda persoa "));
       
       DuoPersona obx = new DuoPersona();
       obx.pesoNome(nome1, peso1, nome2, peso2);
    }
    
}
