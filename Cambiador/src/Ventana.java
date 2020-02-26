
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Ventana extends JFrame implements ActionListener{
     
    double tasa = 3453.50;
    public JTextField texto;
    public Ventana() throws HeadlessException{
        super();
        setBounds(300, 300, 400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        JButton convertir = new JButton("Convertir");
        convertir.setBounds(120, 20, 110, 20);
        convertir.addActionListener(this);
        add(convertir);
        texto = new JTextField();
        texto.setBounds(10, 20, 100, 20);
        add(texto);
        JButton tasa = new JButton("Cambiar Tasa");
        tasa.setBounds(20, 45, 150, 20);
        tasa.addActionListener(this);
        add(tasa);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Convertir")){
            double dato = Double.parseDouble(texto.getText());
            double valor = dato * tasa;
            JOptionPane.showMessageDialog(null, valor);
        }
        if(ae.getActionCommand().equals("Cambiar Tasa")){
            tasa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Tasa"));
        }
    }
    
}
