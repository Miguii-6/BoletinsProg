
package com.miguel.Partes;

public class Cpu {
    private int velocidade;
    public Cpu(){
        
    }
    
    public Cpu(int velocidade){
        this.velocidade=velocidade;
    }
    
    
    public int getVelocidade(){
        return velocidade;
    }
    
    public void setVelocidade(int velocidade){
        this.velocidade=velocidade;
    }

    @Override
    public String toString() {
        return "Cpu{" + "velocidade=" + velocidade + '}';
    }
    
}

