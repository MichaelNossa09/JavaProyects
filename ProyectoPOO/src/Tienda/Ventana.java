
package Tienda;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.time.LocalDateTime;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Ventana extends JFrame implements ActionListener, KeyListener{
   public JLabel Producto;
   public JLabel Cantidad;
   public JLabel Precio;
   public JButton ComprarNA;
   public JButton ComprarAE;
   public JButton Admin;
   public JButton Vender;
   public JButton Empeñar;
   public JTextField pro;
   public JTextField cant;
   public JTextField pre;
   
    public Ventana() throws HeadlessException{
        super();
        setBounds(400,400,500,250);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        Producto = new JLabel("Producto:");
        Producto.setBounds(20, 20, 80,30);
        add(Producto);
        pro= new JTextField();
        pro.setBounds(85, 25,100,20);
        pro.addKeyListener(this);
        pro.setBackground(Color.LIGHT_GRAY);
        add(pro);
        Cantidad = new JLabel("Cantidad:");
        Cantidad.setBounds(20, 60, 80, 30);
        add(Cantidad);
        cant= new JTextField();
        cant.setBounds(85, 65, 100, 20);
        cant.setBackground(Color.LIGHT_GRAY);
        add(cant);
        Precio = new JLabel("Precio:");
        Precio.setBounds(20, 100, 80, 30);
        add(Precio);
        pre = new JTextField();
        pre.setBounds(85, 105, 100, 20);
        pre.setBackground(Color.LIGHT_GRAY);
        add(pre);
        
        ComprarNA = new JButton("Comprar Nuevo Articulo");
        ComprarNA.setBounds(250, 25, 200, 20);
        ComprarNA.addActionListener(this);
        ComprarNA.setBackground(Color.LIGHT_GRAY);
        add(ComprarNA);
        ComprarAE = new JButton("Comprar Articulo Existente");
        ComprarAE.setBounds(250, 55, 200, 20);
        ComprarAE.addActionListener(this);
        ComprarAE.setBackground(Color.LIGHT_GRAY);
        add(ComprarAE);
        
        Vender = new JButton("Vender");
        Vender.setBounds(250, 85, 100, 20);
        Vender.addActionListener(this);
        Vender.setBackground(Color.LIGHT_GRAY);
        add(Vender);
        
        Empeñar = new JButton("Empeñar");
        Empeñar.setBounds(250, 110, 100, 20);
        Empeñar.addActionListener(this);
        Empeñar.setBackground(Color.LIGHT_GRAY);
        add(Empeñar);
        
        Admin = new JButton("ADMINISTRADOR");
        Admin.setBounds(20, 150, 150, 25);
        Admin.addActionListener(this);
        Admin.setBackground(Color.LIGHT_GRAY);
        add(Admin);
    Empeñar.setEnabled(false);
    ComprarAE.setEnabled(false);
    Vender.setEnabled(false);
    }
        Company logica = new Company();
        File producto = new File ("Productos.txt");
        File cantidad = new File ("Cantidad.txt");
        File precio = new File ("Precio.txt");
        File vendidos = new File ("Vendidos.txt");
        File empeñados = new File ("Empeñados.txt");
        File ID = new File ("ID.txt");
        File CantEmp = new File("CantEmp.txt");
        File NomPro = new File ("NomPro.txt");
        File Valor = new File ("Valor.txt");
        File Status = new File ("Status.txt");
        File Fecha = new File ("Fecha.txt");
        File Vencidos = new File("Vencidos.txt");
        int id;
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().compareTo("Comprar Nuevo Articulo")==0){
          if(pro.getText().trim().length()!=0){
                if(cant.getText().trim().length()!=0){
                    if(pre.getText().trim().length()!=0){
                         logica.crearArchivo(producto,pro.getText());
                         logica.crearArchivo(cantidad,cant.getText());
                         logica.crearArchivo(precio,pre.getText());
                         logica.crearArchivo(vendidos,"00");
                         logica.crearArchivo(empeñados,"00");
                         logica.crearArchivo(Vencidos, "No");
                         pro.setText("");
                         cant.setText("");
                         pre.setText("");
                    }
                }
          }
        }
        if(e.getActionCommand().compareTo("Vender")==0){
            
            if(pro.getText().trim().length()!=0){
                if(cant.getText().trim().length()!=0){
                    if(pre.getText().trim().length()!=0){
                        if((Integer.parseInt(cant.getText()))<=logica.BusquedaPOS(cantidad, logica.linea)){
                        String p = (logica.BusquedaPOS(cantidad, logica.linea)-Integer.parseInt(cant.getText()))+"";
                        String ven = (logica.BusquedaPOS(vendidos, logica.linea)+Integer.parseInt(cant.getText()))+"";
                        int ps = (logica.linea-1)*4;
                        if(Integer.parseInt(p)<10){
                        logica.ModificarFichero("Cantidad.txt","0"+p,ps);
                        }else{
                        logica.ModificarFichero("Cantidad.txt",p,ps);
                        }
                        if(Integer.parseInt(ven)<10){
                        logica.ModificarFichero("Vendidos.txt","0"+ven,ps);
                        }else{
                        logica.ModificarFichero("Vendidos.txt",ven,ps);
                        }
                       LocalDateTime locaDate = LocalDateTime.now();
                       int hours  = locaDate.getHour();
                       int minutes = locaDate.getMinute();
                       int seconds = locaDate.getSecond();
                       System.out.println("Hora actual : " + hours  + ":"+ minutes +":"+seconds); 
                       id=id+1;
                       logica.crearArchivo(NomPro,pro.getText());
                       logica.crearArchivo(Valor,pre.getText());
                       logica.crearArchivo(Status,"Vendido");
                       logica.crearArchivo(CantEmp,cant.getText());
                       logica.crearArchivo(Fecha,minutes+"");
                       logica.crearArchivo(ID,id+"");
                       JOptionPane.showMessageDialog(this, "ID: "+id+"\n"+
                       "Producto: "+pro.getText()+"\n"+
                       "Precio: "+pre.getText()+"\n"+
                       "Canditad: "+cant.getText()+"\n"+
                       "Total: "+Integer.parseInt(pre.getText())*(Integer.parseInt(cant.getText())));
                         pro.setText("");
                         cant.setText("");
                         pre.setText("");
                    }else{
                       JOptionPane.showMessageDialog(null, "Error, no posee la cantidad ingresada.");
                        }
                }
                        
                }
            }

        }
        if(e.getActionCommand().compareTo("Comprar Articulo Existente")==0){
            if(pro.getText().trim().length()!=0){
                if(cant.getText().trim().length()!=0){
                    if(pre.getText().trim().length()!=0){
                        String p = (logica.BusquedaPOS(cantidad, logica.linea)+Integer.parseInt(cant.getText()))+"";
                        int ps = (logica.linea-1)*4;
                        if((Integer.parseInt(p))<10){
                        logica.ModificarFichero("Cantidad.txt","0"+p,ps);
                        }else{
                        logica.ModificarFichero("Cantidad.txt",p,ps);
                        }
                         JOptionPane.showMessageDialog(this, "Nombre: "+pro.getText()+"\n"+
                         "Precio :"+logica.BusquedaPOS(precio, logica.linea)+"\n"+
                         "Canditad: "+logica.BusquedaPOS(cantidad, logica.linea)+"\n"+
                         "Total: "+(logica.BusquedaPOS(precio, logica.linea)*Integer.parseInt(cant.getText())));
                         pro.setText("");
                         cant.setText("");
                         pre.setText("");
                    }
                }
            }
        }
        if(e.getActionCommand().compareTo("Empeñar")==0){
          if(pro.getText().trim().length()!=0){
                if(cant.getText().trim().length()!=0){
                    if(pre.getText().trim().length()!=0){      
                       String p = (logica.BusquedaPOS(empeñados, logica.linea)+Integer.parseInt(cant.getText()))+"";
                       int ps = (logica.linea-1)*4;      
                       if((Integer.parseInt(p))<10){
                       logica.ModificarFichero("Empeñados.txt","0"+p,ps);
                       }else{
                       logica.ModificarFichero("Empeñados.txt",p,ps);
                       }
                       LocalDateTime locaDate = LocalDateTime.now();
                       int hours  = locaDate.getHour();
                       int minutes = locaDate.getMinute();
                       int seconds = locaDate.getSecond();
                       System.out.println("Hora actual : " + hours  + ":"+ minutes +":"+seconds); 
                       id=id+1;
                       logica.crearArchivo(NomPro,pro.getText());
                       logica.crearArchivo(Valor,pre.getText());
                       logica.crearArchivo(Status,"Empeño");
                       logica.crearArchivo(Vencidos, "No");
                       logica.crearArchivo(CantEmp,cant.getText());
                       logica.crearArchivo(Fecha,minutes+"");
                       logica.crearArchivo(ID,id+"");
                       JOptionPane.showMessageDialog(this, "ID: "+id+"\n"+
                       "Producto: "+pro.getText()+"\n"+
                       "Precio: "+pre.getText()+"\n"+
                       "Canditad: "+cant.getText()+"\n"+
                       "Total: "+Integer.parseInt(pre.getText())*(Integer.parseInt(cant.getText())));
                       pro.setText("");
                       cant.setText("");
                       pre.setText("");
                    }
                }
            }
        }
        if(e.getActionCommand().compareTo("ADMINISTRADOR")==0){
            logica.login();
        }
        
        
    }
  

    @Override
    public void keyTyped(KeyEvent ke) {
   
    }

    @Override
    public void keyPressed(KeyEvent ke) {
       
    }

    @Override
    public void keyReleased(KeyEvent ke) {
      // System.out.println(pro.getText());
       if(logica.Busqueda(producto, pro.getText())==1){
           cant.setText("1");
              Empeñar.setEnabled(true);
              ComprarAE.setEnabled(true);
              Vender.setEnabled(true);
              ComprarNA.setEnabled(false);
       }else{
         Empeñar.setEnabled(false);
         ComprarAE.setEnabled(false);
         Vender.setEnabled(false);
         ComprarNA.setEnabled(true);
       }
    }

    
    
}
