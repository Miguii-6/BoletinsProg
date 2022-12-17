
package boletin13;


import PaqueteB.ClasePersoal;

public class Boletin13 {

    public static void main(String[] args) {
        ClasePersoal alum = new ClasePersoal("23420923","hol@hola.com");
        ClaseAcademica clac = new ClaseAcademica ("Victoria",7.3,alum);
        
        System.out.println( alum.toString());
        System.out.println(clac.toString());
        System.out.println("nombre: " + clac.getNome());
    }
    
}
