
package boletin14;

import com.miguel.Partes.*;

public class Boletin14 {

    public static void main(String[] args) {
        // TODO code application logic here
        Monitor mo = new Monitor ((float) 24.6);
        Teclado te = new Teclado ("marca");
        Cpu pro = new Cpu(45);
        Ordenador obx= new Ordenador(mo, te, pro,(float)323.3);
        
        System.out.println();
        
        
                
              
    }
    
}
