
package boletin16;

import boletin16.com.migui.persoa.Persoa;



public class CuentaCorriente extends Conta {
    private double interese = 1.5;
    
    private double saldo;
    
    //constructores
    public CuentaCorriente(){}
    
    public CuentaCorriente(Cliente cli, long nC){
        super (cli, nC);
        super.setSaldo(1500);
        saldo = super.getSaldo();
        saldo = saldo - (saldo*interese/100);
    }
    
    //método toString

    @Override
    public String toString() {
        return super.toString() + " saldo=" + saldo;
    }   
    
    

    
    
    
    
}
