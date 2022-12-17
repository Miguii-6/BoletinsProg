
package boletin16.com.migui.persoa;

public class Persoa {
    private String nome, apelidos, nif;
    
    public Persoa (){}

    public Persoa (String nom, String apel, String nf){
        nome = nom;
        apelidos = apel;
        nif = nf;
    }
    
    public void setNome(String nom){
       nome = nom;
    }
    
    public String getNome(){
        String nom = nome;
        return nom;
    }
    
    public void setApelido(String apel){
       apelidos = apel;
    }
    
    public String getApelido(){
        String apel = apelidos;
        return apel;
    }
    
    public void setNif(String nf){
       nif = nf;
    }
    
    public String getNif(){
        String nf = nif;
        return nf;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", apelidos=" + apelidos + ", nif=" + nif ;
    } 
    
    
}

