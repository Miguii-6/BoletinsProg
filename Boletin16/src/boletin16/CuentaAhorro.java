
package boletin16;

import boletin16.com.migui.persoa.Persoa;
import javax.swing.JOptionPane;

public class CuentaAhorro extends Conta {
    private float IntereseVariable;
    private double SaldoMin;

   

    public CuentaAhorro(float IntereseVariable, double SaldoMin, int numeroConta, double saldo, Persoa Cliente) {
        super(numeroConta, saldo, Cliente);
        this.IntereseVariable = IntereseVariable;
        this.SaldoMin = SaldoMin;
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaAhorro{" + "IntereseVariable=" + IntereseVariable + ", SaldoMin=" + SaldoMin + '}';
    }
    
    public float CambiarInterese(String mensaxe){
        IntereseVariable = Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        return IntereseVariable;
    }
    
}
