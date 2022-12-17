
package boletin12_5;

import javax.swing.JOptionPane;

public class Calculos {
    public void soldos(){
        int cs=0,cm=0,c=0,s;
        do{
            s= Integer.parseInt(JOptionPane.showInputDialog("Escribe o salario: "));
            if(s<0)
                System.out.println("erro");
            else if (s<1750 && s>1000){
                cs++;
            }
            else if(s<1000 && s>0){
                cm++;
            }
            c++;
            System.out.println("Salarios entre 1750 e 1000"+ cs + "\n Porcentaje de salarios que son menos de 1000" + (cm*100/c));
        
        }while(s!=0);
    }
}
