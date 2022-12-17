
package boletin14;

import com.miguel.Partes.*;

public class Ordenador {
    private Monitor mo;
    private Teclado te;
    private Cpu pro;
    private float precio;
    
    
    public Ordenador(Monitor mo1, Teclado te1, Cpu pro1, float par){
        
    }

    public Ordenador(String pulgadas, String marca,String velocidade, float precio) {
        mo.setPulgadas((float) 24.3);
        te.setNome(marca);
        pro.setVelocidade(0);
        this.precio = precio;
    }
    
    public Monitor getMo() {
        return mo;
    }

    public void setMo(Monitor mo) {
        this.mo = mo;
    }

    public Teclado getTe() {
        return te;
    }

    public void setTe(Teclado te) {
        this.te = te;
    }

    public Cpu getPro() {
        return pro;
    }

    public void setPro(Cpu pro) {
        this.pro = pro;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "mo=" + mo + ", te=" + te + ", pro=" + pro + ", precio=" + precio + '}';
    }
    
    
}
