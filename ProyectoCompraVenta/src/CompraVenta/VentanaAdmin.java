
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

class VentanaAdmin extends JFrame implements ActionListener, KeyListener{
  public JTable tabla1;
  public JTable tabla2;
  public JLabel producto;
  public JLabel cantidad;
  public JLabel precio;
  public JLabel producto2;
  public JLabel cantidad2;
  public JLabel precio2;
  public JLabel Estado;
  public JLabel empeñados;
  public JLabel minuto;
  public JButton Cerrar;
  public JButton Buscar;
  public JTextField jtf;
 
  logica log = new logica();
  File productos = new File ("productos.txt");
  File cantidades = new File ("cantidad.txt");
  File precios = new File ("precio.txt");
  File id = new File ("id.txt");
  File cantidadempeñados = new File("cantidademp.txt");
  File productoempven = new File ("prodcomven.txt");
  File valor = new File ("valor.txt");
  File estado = new File ("estado.txt");
  File fecha = new File ("fecha.txt");
  File vencidos = new File("vencidos.txt");

    public VentanaAdmin() throws HeadlessException {
        super();
        this.setTitle("Inventario");
        setBounds(200,200,500,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        tabla1 = new JTable();
        tabla1.setBounds(20, 40, 320, 150);
        add(tabla1);
        tabla2= new JTable();
        tabla2.setBounds(20, 230, 380, 150);
        add(tabla2);
        DefaultTableModel modelo = new DefaultTableModel();
        DefaultTableModel modelo2 = new DefaultTableModel();
        tabla1.setModel(modelo);
        tabla2.setModel(modelo2);
        modelo = (DefaultTableModel) tabla1.getModel();
        modelo2= (DefaultTableModel) tabla2.getModel();
        setLocationRelativeTo(null);
        Cerrar = new JButton("Cerrar");
        Cerrar.setBounds(5,440,80, 20);
        Cerrar.addActionListener(this);
        add(Cerrar);
        jtf= new JTextField();
        jtf.setBounds(360, 20, 130, 25);
        jtf.addKeyListener(this);
        add(jtf);
        Buscar = new JButton("Buscar");
        Buscar.setBounds(360, 60, 80, 20);
        Buscar.addActionListener(this);
        add(Buscar);
        
        producto = new JLabel("Productos");
        producto.setBounds(20, 20, 60, 20);
        add(producto);
        
        producto2 = new JLabel("Productos");
        producto2.setBounds(20, 210, 60, 20);
        add(producto2);
        
        cantidad = new JLabel("Cantidad");
        cantidad.setBounds(140, 20, 60, 20);
        add(cantidad);
        
        cantidad2 = new JLabel("Cantidad");
        cantidad2.setBounds(90, 210, 60, 20);
        add(cantidad2);
        
        precio=new JLabel("Precio");
        precio.setBounds(250, 20, 60, 20);
        add(precio);
        
        precio2=new JLabel("Precio");
        precio2.setBounds(160, 210, 60, 20);
        add(precio2);
        
        
        Estado = new JLabel("Estado");
        Estado.setBounds(210, 210, 60, 20);
        add(Estado);
 
        empeñados = new JLabel("Vencido");
        empeñados.setBounds(280, 210, 70, 20);
        add(empeñados);
        
        minuto = new JLabel("Fecha");
        minuto.setBounds(340, 210, 70, 20);
        add(minuto);
        Buscar.setEnabled(false);
        
         
        log.GuardadoArray1(productos, "");
        modelo.addColumn("productos",log.array1);
        tabla1.setModel(modelo);
        
        log.GuardadoArray1(cantidades, "");  
        modelo.addColumn("\ncantidad",log.array1); 
        tabla1.setModel(modelo); 

        log.GuardadoArray1(precios, "");  
        modelo.addColumn("\nprecios",log.array1); 
        tabla1.setModel(modelo); 

        log.GuardadoArray2(productoempven, "");  
        modelo2.addColumn("\nproductoempven",log.array2); 
        tabla2.setModel(modelo2); 
        
        log.GuardadoArray2(cantidadempeñados, "");
        modelo2.addColumn("\ncantidadempeñados",log.array2);
        tabla2.setModel(modelo);
        
        log.GuardadoArray2(valor, "");  
        modelo2.addColumn("\nvalor",log.array2); 
        tabla2.setModel(modelo2); 
        
        log.GuardadoArray2(estado, "");  
        modelo2.addColumn("\nestado",log.array2); 
        tabla2.setModel(modelo2); 
         
        log.GuardadoArray2(vencidos, "");
        modelo2.addColumn("\nvencidos", log.array2);
        tabla2.setModel(modelo2);
        
        log.GuardadoArray2(fecha, "");
        modelo2.addColumn("\nfecha", log.array2);
        tabla2.setModel(modelo2);
       
    }
  
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().compareTo("Cerrar")==0){
            dispose();
        }
        if(ae.getActionCommand().compareTo("Buscar")==0){
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        int intereses = 0;
        if(log.BusquedaInt(fecha, log.linea)<minutes){
         int x = log.BusquedaInt(valor, log.linea);
         int z = log.BusquedaInt(cantidadempeñados, log.linea);
           if(log.BusquedaString(estado, log.linea).equals("Empeño")){
             String xz = log.BusquedaString(vencidos, log.linea);
             int xzs = (log.linea-1)*4;
             log.Modificar("vencidos.txt", "Si", xzs);
             intereses=(((x*z)*5)/100)+intereses;
         }
         
        }
        int c, p;
        c = log.BusquedaInt(cantidadempeñados, log.linea);
        p = log.BusquedaInt(valor, log.linea);
        int dato = log.BusquedaInt(productoempven, log.linea);
        JOptionPane.showMessageDialog(this, "ID: "+jtf.getText()+"\n"+
                "Producto: "+log.BusquedaString(productoempven, log.linea)+"\n"+
                "Precio: "+log.BusquedaInt(valor, log.linea)+"\n"+
                "Canditad: "+log.BusquedaInt(cantidadempeñados, log.linea)+"\n"+
                "Total: "+(c*p)+"\n"+
                "Intereses: "+intereses);
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
         if(log.Busqueda(id, jtf.getText())==1){
              Buscar.setEnabled(true);
       }else{
            Buscar.setEnabled(false);

       }
    }
    
    
}
