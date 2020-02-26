
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{
   public JTextField jtf;
   public JTextField jt1;
   public JTextArea jta;
    public Ventana(String title) throws HeadlessException {
        super(title);
        setBounds(100,100,400,400);
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //  setResizable(false); // No poder Maximizar / Minimizar
        setLayout(null);
        JLabel jl = new JLabel("Texto:");
        jl.setBounds(10, 20, 60, 30);
        add(jl);
        JButton jb = new JButton("Aceptar");
        jb.setBounds(100, 50, 80, 30);
        jb.addActionListener(this);
        add(jb);
        JButton jb1 = new JButton("Leer");
        jb1.setBounds(180, 50, 80, 30);
        jb1.addActionListener(this);
        add(jb1);
        jta = new JTextArea();
        jta.setBounds(50, 150, 300, 200);
        add(jta);
        jtf = new JTextField();
        jtf.setBounds(50, 20, 300, 30);
        add(jtf);
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().compareTo("Aceptar")==0){
            File f = new File("Archivo.txt");
            FileWriter fw;
            try {
                fw = new FileWriter(f, true);
                PrintWriter pw = new PrintWriter(fw);
                pw.append("\n"+jtf.getText());
                pw.close();
            } catch (IOException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(e.getActionCommand().compareTo("Leer")==0){
            File f = new File("Archivo.txt");
            FileReader fr;
            try {
                fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea = br.readLine();
                while((linea=br.readLine())!=null)
                    jta.setText(jta.getText()+linea+"\n");;
            }catch (FileNotFoundException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
  
        }
    }
    
}
