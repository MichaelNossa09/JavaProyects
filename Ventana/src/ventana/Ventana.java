
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana extends JFrame{

   public Ventana(){
      
       setSize(500,500);
       setTitle("Michael Nossa");
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setMinimumSize(new Dimension(200, 200));
       this.getContentPane().setBackground(Color.LIGHT_GRAY);
   }
   private void inciarComponentes(){
       JPanel panel = new JPanel();
               
   }
   
   
    
}
