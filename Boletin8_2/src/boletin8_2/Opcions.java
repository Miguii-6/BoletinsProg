
package boletin8_2;

import javax.swing.JOptionPane;


public class Opcions {
     public void opcions (int opcion){
        
    
    switch (opcion) {
    
        case 1:
            
            double lado=Double.parseDouble(JOptionPane.showInputDialog("Inserte lado do cuadrado: "));
            double superficieCua=Math.pow(lado, lado);
            JOptionPane.showMessageDialog(null, "A superficei e "+superficieCua);
           
            break;
            
        case 2:
            
            double base=Double.parseDouble(JOptionPane.showInputDialog("Medida da base do triangulo: "));
            double altura=Double.parseDouble(JOptionPane.showInputDialog("Medida da altura do triangulo: "));
            double superficieTri=(base*altura)/2;
            JOptionPane.showMessageDialog(null, "A superficei e "+superficieTri);
            
            break;
            
        case 3:
            double radio=Double.parseDouble(JOptionPane.showInputDialog("Medida do radio do circulo: "));
            double superficieCir=Math.PI*Math.pow(radio, 2);
            JOptionPane.showMessageDialog(null, "A superficei e "+superficieCir);
          
            break; 
            
        default:
            JOptionPane.showMessageDialog(null, "Opncion non valida");
          
            break;
    
    
    }
    
    }
}
