
package boletin12_1;

import javax.swing.JOptionPane;


public class AdivinhaNumero {
    public void adivina(){
        int numAcer = Integer.parseInt(JOptionPane.showInputDialog("Escribe o numero a acertar: "));
        int intentos =Integer.parseInt(JOptionPane.showInputDialog("Escribe o numero de intentos: "));
        int numUsuario;
        int i= 0;
        do {
            
            numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinhar o numero que pensei. Escribe o numero que pensas: "));
            if (numAcer > numUsuario) {
                JOptionPane.showMessageDialog(null, "O numero a adivinhar e maior ");
            } else if (numAcer < numUsuario) { 
                JOptionPane.showMessageDialog(null, "O numero a adivinhar e menor");
            }
            i++;
        } while (numAcer != numUsuario && intentos != i);
        JOptionPane.showMessageDialog(null, "O numero que pensaches foi: " + numAcer);
    }
}
