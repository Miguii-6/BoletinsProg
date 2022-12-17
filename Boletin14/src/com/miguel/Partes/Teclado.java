
package com.miguel.Partes;

public class Teclado {
    private String marca;
    
    public Teclado(){
        
    }
    
    public Teclado(String marca){
        this.marca=marca;
    }
    
    public String getMarca(){
        return marca;
    }

    public void setNome(String marca){
        this.marca=marca;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + '}';
    }
    
    





}


