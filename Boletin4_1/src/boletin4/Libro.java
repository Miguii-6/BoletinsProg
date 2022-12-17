
package boletin4;


public class Libro {
    
    //declaro atributos
    private String titulo;
    private String autor;
    private int ano;
    private short pags;
    private float val;
    
    //contructores
    public Libro(String titu, String auto, int a, short pa){ //constructor parametrizado
        titulo= titu;
        autor= auto;
        ano = a;
        pags= pa;
    }
    
    public Libro(){ //constructor por defecto
        
        
    }

    Libro(String diez_negritos, String agatha_Christie, int i, short s, float f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    


    //métodos de acceso getters e setters
    public void setTitulo(String titulo){ 
        this.titulo=titulo;
    }
    public String getTitulo(){ 
       return titulo; 
    }
    public void setAutor(String autor){ 
        this.autor=autor;
    }
    public String getAutor(){ 
       return autor; 
    }
    public void setAno(int ano){ 
        this.ano=ano;
    }
    public float getAno(){ 
       return ano; 
    }
    public void setPags(short pags){ 
        this.pags=pags;
    }
    public float getPags(){ 
       return pags; 
    }
    public void setVal(float val){ 
        this.val=val;
    }
    public float getVal(){ 
       return val; 
    }
     //defino métodos
    public void caracLibro(){
        System.out.println("O titulo é "+ titulo + " o seu autor é "+ autor + " do ano "+ ano + " ten "+ pags + " páginas, e a sua valoracion é: "+val);
      
    }
    

    
}
