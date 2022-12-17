
package boletin11_4;

import javax.swing.JOptionPane;

public class TabMulti {
    
public void tablaNumero(){
        int i, resultado;
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe o numero: "));
        for(i=0;i<=10;i++){
            if(num!=0){
            resultado =  num * i;
            System.out.println(num+" x "+i+" = "+resultado);
            }
            else{
                System.out.println("Número distinto de 0.");
                break;
            }
        }
    }
}
