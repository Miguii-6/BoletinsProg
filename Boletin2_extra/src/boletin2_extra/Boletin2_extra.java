
package boletin2_extra;

public class Boletin2_extra {

    public static void main(String[] args) {
       
        Cuenta banco= new Cuenta("Santander","ES8905",0,9000);
        Cuenta cliente1 = new Cuenta("Manolo","ES3549",0,5000);
        Cuenta cliente2 = new Cuenta("Angel","ES3548",0,5000);
        System.out.println("saldo cliente1  " + cliente1.getSaldo());
        System.out.println("saldo cliente2  "+ cliente2.getSaldo());
        cliente1.transferencia(cliente2, 100,10);
        System.out.println("saldo cliente1  " + cliente1.getSaldo());
        System.out.println("saldo cliente2  "+ cliente2.getSaldo());
        System.out.println("");
        System.out.println("");
           
        cliente1.transferencia2(cliente1, cliente2, 150,10, banco);
        
        System.out.println("saldo cliente1  " + cliente1.getSaldo());
        System.out.println("saldo cliente2  "+ cliente2.getSaldo());
        System.out.println("saldo banco " + banco.getNombre() +" " +banco.getSaldo());
        
        
        
        
        
        
        
        
        
    }
    
}
