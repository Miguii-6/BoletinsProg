
package boletin11_2;

import javax.swing.JOptionPane;

public class SumRango {
    public void rangito(){
        int sum=0,i;
        double produc=1;
        for(i=9+1 ;i<=90; i++){
            sum += i;
            produc= produc *i;
        }
        JOptionPane.showMessageDialog(null, "A suma =" +sum+ "\n O producto =" +produc);   
    }

}
