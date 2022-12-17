
package boletin6_3;


public class Boletin6_3 {

    
    public static void main(String[] args) {
        
        Circulo cir1 = new Circulo(3);
        Circulo cir2 = new Circulo();
        cir2.setRadio(4);
        
        double area = cir1.calcularArea();
        double lonxitude = cir2.calcularLonxitude();
        
        System.out.println("A area do circulo e = " + area);
        System.out.println("A lonxitude do circulo e = " + lonxitude);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
