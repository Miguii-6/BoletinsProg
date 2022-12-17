
package boletin12_2;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;


public class AdivinhaNumero {
    public void adivina(){
        int numAcer = ThreadLocalRandom.current().nextInt(1, 50);
        int intentos =Integer.parseInt(JOptionPane.showInputDialog("Escribe o numero de intentos: "));
        int numUsuario;
        int i= 0;
        do {
            numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinhar o numero que pensei. Escribe o numero que pensas: "));
            if (numAcer-numUsuario>20) {
                JOptionPane.showMessageDialog(null, "O numero esta moi lonxe ");
            } else if (numAcer-numUsuario<20&&numAcer-numUsuario>10) { 
                JOptionPane.showMessageDialog(null, "O numero esta lonxe");
            } else if (numAcer-numUsuario<10&&numAcer-numUsuario>5) { 
                JOptionPane.showMessageDialog(null, "O numero esta preto");
            }else if (numAcer-numUsuario<=5) { 
                JOptionPane.showMessageDialog(null, "O numero esta moi preto");
            }
            i++;
        } while (numAcer != numUsuario && intentos != i);
        JOptionPane.showMessageDialog(null, "O numero do ordenador foi: " + numAcer);
    }
}
