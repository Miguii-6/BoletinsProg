
package boletin8_1;

public class Almacen {
    public void mirarVentas(String nome, int vendas){
        if(vendas<=100)
            System.out.println("baixo");
        else if(100>vendas && vendas<=500)
            System.out.println("medio");
            else if(500<vendas && vendas<=1000)
                System.out.println("alto");
                else if(1000<vendas)
                   System.out.println("primeira necesidade");
    }
}
