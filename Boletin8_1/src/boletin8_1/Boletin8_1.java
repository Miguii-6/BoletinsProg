
package boletin8_1;

import javax.swing.JOptionPane;

public class Boletin8_1 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("inseerte o nome do artigo");
        int vendas = Integer.parseInt(JOptionPane.showInputDialog("inseerte o numero de vendas anuais"));
       Almacen obx = new Almacen();
       obx.mirarVentas(nome, vendas);
    }
    
}
