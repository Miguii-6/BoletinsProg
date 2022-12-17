
package boletin5;

public class Boletin5 {
    public static double gasoleoA = 1.995;
    public static double gasoleoA_Plus = 2.087;
    public static double gasolina_95 =1.773;
    public static double gasolina_98=1.935;
    
    public static void main(String[] args) {
        
        Consumo coche1 = new Consumo ();
        coche1.setKm(300);
        coche1.setLitros(50);
        coche1.setvMedia(300);
        coche1.setpGas(gasoleoA);
        
        
        double tiempo = coche1.getTime(200);
        System.out.println(tiempo);
        
        
        double consumo = coche1.consumoMedio();
        System.out.println(consumo);
        
        
        double consumo_euros = coche1.consumoEuros(consumo);
        System.out.println(consumo_euros);
        
        
        
        
        
        
    }
    
}
