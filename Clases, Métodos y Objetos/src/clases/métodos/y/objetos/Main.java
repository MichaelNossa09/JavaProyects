
package clases.métodos.y.objetos;

import javax.swing.JOptionPane;

public class Main {
   
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        ClasesMétodosYObjetos op = new ClasesMétodosYObjetos();
        
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        op.mostrarresultados();
    }
    
}
