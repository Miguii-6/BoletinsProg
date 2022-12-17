
package boletin16;

public class Boletin16 {

    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cli = new Cliente("ol", "asfasdfs asdfafsds", "123452345F"); 
        
        Cliente cli2 = new Cliente("Owrwreg", "sfgs", "23452345d");
        
        CuentaAhorro obxCa = new CuentaAhorro();
        System.out.println(obxCa.toString());
        obxCa.ingresar();
        obxCa.retirar();
        obxCa.actualizarSaldo();
        
        CuentaCorriente Cc = new CuentaCorriente(cli2, 5489);
        System.out.println(Cc.toString());
        Cc.ingresar();
        Cc.retirar();
        Cc.actualizarSaldo();
        
    }
    
}
