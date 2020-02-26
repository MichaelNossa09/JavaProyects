
package excepciones;

import javax.swing.JOptionPane;


public class Excepciones {

    public void dividir() throws RuntimeException{
        int num=1, num2=0;
        int resultado;
        
        resultado=num/num2;
        
    }
    public void resultado(){
        try {
            dividir();
        } catch (RuntimeException ex) {
            JOptionPane.showMessageDialog(null,"No puede dividir entre 0");
        }
        
        System.out.println("Programa Terminado.");
       
    }
    public static void main(String[] args) {
       
        Excepciones b = new Excepciones();
        b.resultado();
    }
    
}
