
package boletin6;


public class Coche {
    private int velocidad;
    
    
    public Coche(){
        velocidad =0;
    }
    
    
    public int getVelocidad(){
        return velocidad;
    }
    public void acelerar(int acelera){
        velocidad += Math.abs(acelera);
    }
    public void frenar(int frena){
        velocidad -= Math.abs(frena);
    }
    
    
    
    
    
    
    
    
}
