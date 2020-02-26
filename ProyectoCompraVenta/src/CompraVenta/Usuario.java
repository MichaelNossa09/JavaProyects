
package CompraVenta;

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
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Usuario extends JFrame implements ActionListener, KeyListener {
   public JLabel producto;
   public JLabel cantidad;
   public JLabel precio;
   public JButton comprar;
   public JButton vender;
   public JButton empeñar;
   public JTextField prod;
   public JTextField cant;
   public JTextField prec;
   logica log = new logica();
   File productos = new File ("productos.txt");
   File cantidads = new File ("cantidad.txt");
   File precios = new File ("precio.txt");
   File id = new File ("id.txt");
   File cantemp = new File("cantidademp.txt");
   File producvencom = new File ("prodcomven.txt");
   File valor = new File ("valor.txt");
   File estado = new File ("estado.txt");
   File fecha = new File ("fecha.txt");
   File vencidos = new File("vencidos.txt");
   int idd;
    public Usuario() throws HeadlessException {
        super();
        setBounds(200,200,400,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        producto = new JLabel("Producto:");
        producto.setBounds(20, 20, 80,30);
        add(producto);
        prod= new JTextField();
        prod.setBounds(85, 25,100,20);
        prod.addKeyListener(this);
        add(prod);
        comprar= new JButton("Comprar Producto");
        comprar.setBounds(40, 150, 200, 20);
        comprar.addActionListener(this);
        add(comprar);

        vender = new JButton("Vender");
        vender.setBounds(280, 25, 100, 20);
        vender.addActionListener(this);
        add(vender);
        
        empeñar = new JButton("Empeñar");
        empeñar.setBounds(280, 65, 100, 20);
        empeñar.addActionListener(this);
        add(empeñar);
        cantidad = new JLabel("Cantidad:");
        cantidad.setBounds(20, 60, 80, 30);
        add(cantidad);
        cant= new JTextField();
        cant.setBounds(85, 65, 100, 20);
        add(cant);
        precio = new JLabel("Precio:");
        precio.setBounds(20, 100, 80, 30);
        add(precio);
        prec = new JTextField();
        prec.setBounds(85, 105, 100, 20);
        add(prec);
        
       
       empeñar.setEnabled(false);
       vender.setEnabled(false);
    }    
    
  
   
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Comprar Producto")){
                log.crear(productos,prod.getText());
                log.crear(cantidads,cant.getText());
                log.crear(precios,prec.getText());
                log.crear(vencidos, "No");
                prod.setText("");
                cant.setText("");
                prec.setText("");
        }
        if(ae.getActionCommand().equals("Vender")){
            
                if((Integer.parseInt(cant.getText()))<=log.BusquedaInt(cantidads, log.linea)){
                        String x = (log.BusquedaInt(cantidads, log.linea)-Integer.parseInt(cant.getText()))+"";
                        int dato = (log.linea-1)*4;
                        if(Integer.parseInt(x)<10){
                        logica.Modificar("cantidad.txt","0"+x,dato);
                        }else{
                        logica.Modificar("cantidad.txt",x,dato);
                        }       
                       LocalDateTime time = LocalDateTime.now();
                       int minutes = time.getMinute();
                       idd=(int) (Math.random() * 100000);
                       log.crear(producvencom,prod.getText());
                       log.crear(valor,prec.getText());
                       log.crear(estado,"vendido");
                       log.crear(cantemp,cant.getText());
                       log.crear(fecha,minutes+"");
                       log.crear(id,idd+"");
                       JOptionPane.showMessageDialog(this, "ID: "+idd+"\n"+
                       "Producto: "+prod.getText()+"\n"+
                       "Precio: "+prec.getText()+"\n"+
                       "Canditad: "+cant.getText()+"\n"+
                       "Total: "+Integer.parseInt(prec.getText())*(Integer.parseInt(cant.getText())));
                       idd=0;
                    }else{
                       JOptionPane.showMessageDialog(null, "Error, no posee la cantidad ingresada.");
                 }
          }
          if(ae.getActionCommand().equals("Empeñar")){
                       LocalDateTime time = LocalDateTime.now();
                       int minutes = time.getMinute();
                       idd=(int) (Math.random()*100000);
                       log.crear(producvencom,prod.getText());
                       log.crear(valor,prec.getText());
                       log.crear(estado,"Empeño");
                       log.crear(vencidos, "No");
                       log.crear(cantemp,cant.getText());
                       log.crear(fecha,minutes+"");
                       log.crear(id,idd+""); 
                       JOptionPane.showMessageDialog(this, "ID: "+idd+"\n"+
                       "Producto: "+prod.getText()+"\n"+
                       "Precio: "+prec.getText()+"\n"+
                       "Canditad: "+cant.getText()+"\n"+
                       "Total: "+Integer.parseInt(prec.getText())*(Integer.parseInt(cant.getText())));
                       prod.setText("");
                       cant.setText("");
                       prec.setText("");
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
        if(log.Busqueda(productos, prod.getText())==1){
           cant.setText("1");
              empeñar.setEnabled(true);
              vender.setEnabled(true);
              comprar.setEnabled(false);
       }else{
         empeñar.setEnabled(false);
         vender.setEnabled(false);
         comprar.setEnabled(true);
       }
    }
   
}
