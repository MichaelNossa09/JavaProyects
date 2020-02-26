
package CompraVenta;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Ventana extends JFrame implements ActionListener {

   public JButton admin;
   public JButton user;
   logica log = new logica();
    public Ventana() throws HeadlessException {
        super();
        setBounds(150, 150, 320, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        admin = new JButton("ADMINISTRADOR");
        admin.setBounds(10,70, 140, 30);
        admin.addActionListener(this);
        add(admin);
        
        user = new JButton("CLIENTE");
        user.setBounds(160, 70,140, 30);
        user.addActionListener(this);
        add(user);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("CLIENTE")){
            Usuario us = new Usuario();
            us.setVisible(true);
        }
        if(ae.getActionCommand().equals("ADMINISTRADOR")){
            VentanaAdmin va = new VentanaAdmin();
            va.setVisible(true);
        }
    }
    
}
