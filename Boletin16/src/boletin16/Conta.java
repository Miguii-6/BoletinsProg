
package boletin16;

import boletin16.com.migui.persoa.Persoa;
import javax.swing.JOptionPane;


public class Conta {
    //atributos
    private long numeroConta;
    
    private double saldo;
    
    private Cliente cliente;
    
    //constructores
    public Conta(){}

    public Conta(long numeroConta, double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    
    //métodos
    
    public double ingresar(){
        int ing = JOptionPane.showConfirmDialog(null, "Quieres ingresar dinero");
        
        if (ing == 0){
            double ingreso;
            ingreso = Double.parseDouble(JOptionPane.showInputDialog("Teclee a cantidade a ingresar"));
            while (ingreso < 0){
                ingreso = Double.parseDouble(JOptionPane.showInputDialog("No puedes ingresar menos de 0"));
            }
            saldo = saldo + ingreso;
        }
        return saldo;
    }
    
    public double retirar(){
        int ret = JOptionPane.showConfirmDialog(null, "Quieres retirar dinero");
        if (ret == 0){
            double retirar;
            retirar = Double.parseDouble(JOptionPane.showInputDialog("Teclee a cantidade a ingresar"));
            while (retirar > saldo){
                retirar = Double.parseDouble(JOptionPane.showInputDialog("No puedes retirar mas de lo que tienes de saldo"));
            }
            saldo = saldo - retirar;
        }
        return saldo;
    }
    
    public void actualizarSaldo(){
        JOptionPane.showMessageDialog(null, "O novo saldo é "+saldo);
    }

    @Override
    public String toString() {
        return cliente.toString()+ " numeroConta=" + numeroConta ;
    }
}
