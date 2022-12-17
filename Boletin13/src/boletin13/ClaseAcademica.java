
package boletin13;

import PaqueteB.ClasePersoal;


public class ClaseAcademica {
    public static int numReferencia = 2018;
    private String nome;
    private double nota;
    private ClasePersoal alumno;
    
    public ClaseAcademica (String nome, double nota,ClasePersoal alumno){
        
        this.nome = nome;
        if(nota >=0 && nota <= 10){
            
            this.nota = nota;
        }else{
            this.nota = 0;
        }
        this.alumno = alumno;
        numReferencia +=1;
        
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public static void setNumReferencia(int numReferencia) {
        ClaseAcademica.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public ClasePersoal getAlumno() {
        return alumno;
    }

    public void setAlumno(ClasePersoal alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "ClaseAcademica{" + "nome=" + nome + ", nota=" + nota + ", alumno=" + alumno + '}';
    }
    
}
