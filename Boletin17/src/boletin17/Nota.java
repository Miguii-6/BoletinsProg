
package boletin17;

import javax.swing.JOptionPane;


public class Nota {
    private float examTeo1;
    private float examTeo2;
    private float examPra;
    private int numBoletins;
    private int nota;
    private String sigo;
    private final static int BOLETINS=15;

    
    public void Operacions(){
        
        while(!"no".equalsIgnoreCase(sigo)){
        examTeo1= pedirNotas();
        examTeo2= pedirNotas();
        examPra= pedirNotas();
        numBoletins=(int) pedirNotas();
        float ProbasEscritas=((examTeo1+examTeo2)/2)*(float)0.4;
        float ProbasPractica= examPra*(float)0.4;
        
        float boletin= (float)numBoletins/BOLETINS;
        if(boletin>0.9)
            nota=2;
        else if(boletin>=0.70 && boletin<=0.9)
            nota=1;
        else if(boletin<0.70)
            nota=0;
        
        float totalNota= ProbasEscritas+ProbasPractica+nota;
        JOptionPane.showMessageDialog(null, "A tua nota final  =" +totalNota);
        sigo=JOptionPane.showInputDialog("¿Desexas calcular outra nota?");
        }
    }
    
    
    public Nota() {
    }

    public Nota(float examTeo1, float examTeo2, float examPra, int numBoletins) {
        this.examTeo1 = examTeo1;
        this.examTeo2 = examTeo2;
        this.examPra = examPra;
        this.numBoletins = numBoletins;
    }

    public float getExamTeo1() {
        return examTeo1;
    }

    public void setExamTeo1(float examTeo1) {
        this.examTeo1 = examTeo1;
    }

    public float getExamTeo2() {
        return examTeo2;
    }

    public void setExamTeo2(float examTeo2) {
        this.examTeo2 = examTeo2;
    }

    public float getExamPra() {
        return examPra;
    }

    public void setExamPra(float examPra) {
        this.examPra = examPra;
    }

    public int getNumBoletins() {
        return numBoletins;
    }

    public void setNumBoletins(int numBoletins) {
        this.numBoletins = numBoletins;
    }

    @Override
    public String toString() {
        return "Nota{" + "examTeo1=" + examTeo1 + ", examTeo2=" + examTeo2 + ", examPra=" + examPra + ", numBoletins=" + numBoletins + '}';
    }
    
    public static float pedirNotas(){
        
        return Float.parseFloat(JOptionPane.showInputDialog("Escribe as 3 notas e o numero de boletins: "));
        
    }
}
