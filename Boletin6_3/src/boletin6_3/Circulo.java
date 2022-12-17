
package boletin6_3;


public class Circulo {
   private double radio;
   public static double pi = 3.14;
    
   //constructores
   public Circulo (double radio){
       this.radio = radio;
       
   }
    public Circulo(){
        
    }
    //getters and setters
    public double getRadio(){
        return this.radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getPi(){
        return this.pi;
    }
    //methods
    public double calcularArea(){
        //area circulo = pi*r^2
       return this.pi * Math.pow(this.radio,2);  
    }
    
    public double calcularLonxitude(){
        //lonxitude circunferencia = 2 * PI * r
        return 2* this.pi* this.radio;
    }
    
    
    
    
    
}
