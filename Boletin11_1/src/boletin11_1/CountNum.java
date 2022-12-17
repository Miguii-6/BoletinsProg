
package boletin11_1;

import javax.swing.JOptionPane;

public class CountNum {
    public void nums(){
        int num,posi = 0, nega=0, cero=0;
        for(int i=0; i<10; i++){
            num= lerEnteiro();
            if (num ==0)
                cero++;
            else if (num>0)
                posi++; 
            else if(num<0)
                nega++;
        }
        JOptionPane.showMessageDialog(null, "El total de ceros =" +cero+ "\n O total de positivos ="+posi+ "\n O total de negativos="+nega);
    }
    public static int lerEnteiro(){
    return Integer.parseInt(JOptionPane.showInputDialog("Escribe os numeros: "));
    }
}
