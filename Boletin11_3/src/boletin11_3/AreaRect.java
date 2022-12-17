
package boletin11_3;

import javax.swing.JOptionPane;

public class AreaRect {
    public void calcArea(){
        int base=0, altura=0, area=0;
        base=lerEnteiro();
        altura= lerEnteiro();
        if(base>0&&altura>0){
            
            area= base * altura;
            JOptionPane.showMessageDialog(null, "A area =" +area );
            
        }
        else{
           JOptionPane.showMessageDialog(null, "A base ou a altura e negativa"); 
        }
            
    }
    public static int lerEnteiro(){
    return Integer.parseInt(JOptionPane.showInputDialog("Escribe a base e a altura: "));
    }
}
