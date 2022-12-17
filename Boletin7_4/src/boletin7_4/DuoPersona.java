
package boletin7_4;

public class DuoPersona {
    public void pesoNome(String nome1, double peso1, String nome2, double peso2){
        double diff;
        if(peso1>peso2){
            diff=(peso1-peso2);
            System.out.println("Pesa mais " +nome1+" Por "+ diff+("kg"));
        }   
        else{
            diff= peso2-peso1;
                System.out.println("Pesa mais " +nome2+" Por "+ diff+("kg"));
        }
    }
    
}
