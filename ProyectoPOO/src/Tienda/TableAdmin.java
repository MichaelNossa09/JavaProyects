
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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class TableAdmin extends JFrame implements ActionListener, KeyListener{
  public JTable table;
  public JTable table2;
  public JButton salir;
  public JTextField buscar;
  public JButton Buscar;
  public JLabel Productos;
  public JLabel Cantidades;
  public JLabel Precios;
  public JLabel Vendidos;
  public JLabel Empeñados;
  public JLabel Inventario;
  public JLabel Reportes;
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
    public TableAdmin() throws HeadlessException {
        super();
        setBounds(300,300,800,400);
        this.setTitle("Datos");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        table = new JTable();
        table2= new JTable();
        table.setBounds(20, 60, 320, 150);
        add(table);
        table2.setBounds(380, 60, 380, 150);
        add(table2);
        DefaultTableModel modelo = new DefaultTableModel();
        DefaultTableModel modelo2 = new DefaultTableModel();
        table.setModel(modelo);
        table2.setModel(modelo2);
        modelo = (DefaultTableModel) table.getModel();
        modelo2= (DefaultTableModel) table2.getModel();
        setLocationRelativeTo(null);
        table.setBackground(Color.LIGHT_GRAY);
        table2.setBackground(Color.LIGHT_GRAY);
        salir = new JButton("Salir");
        salir.setBounds(600,320,80, 20);
        salir.addActionListener(this);
        salir.setBackground(Color.LIGHT_GRAY);
        add(salir);
        buscar = new JTextField();
        buscar.setBounds(20, 270, 120, 25);
        buscar.addKeyListener(this);
        buscar.setBackground(Color.LIGHT_GRAY);
        add(buscar);
        Buscar = new JButton("Buscar");
        Buscar.setBounds(20, 300, 80, 20);
        Buscar.addActionListener(this);
        Buscar.setBackground(Color.LIGHT_GRAY);
        add(Buscar);
        
        Productos = new JLabel("Productos");
        Productos.setBounds(20, 40, 60, 20);
        add(Productos);
        Productos = new JLabel("Productos");
        Productos.setBounds(380, 40, 60, 20);
        add(Productos);
        
        Cantidades = new JLabel("Cantidad");
        Cantidades.setBounds(90, 40, 60, 20);
        add(Cantidades);
        Cantidades = new JLabel("Cantidad");
        Cantidades.setBounds(450, 40, 60, 20);
        add(Cantidades);
        
        Precios=new JLabel("Precio");
        Precios.setBounds(160, 40, 60, 20);
        add(Precios);
        Precios=new JLabel("Precio");
        Precios.setBounds(510, 40, 60, 20);
        add(Precios);
        
        Vendidos = new JLabel("Vendidos");
        Vendidos.setBounds(210, 40, 60, 20);
        add(Vendidos);
        Vendidos = new JLabel("Estado");
        Vendidos.setBounds(580, 40, 60, 20);
        add(Vendidos);
        
        Empeñados = new JLabel("Empeñados");
        Empeñados.setBounds(270, 40, 70, 20);
        add(Empeñados);
        Empeñados = new JLabel("Vencido");
        Empeñados.setBounds(640, 40, 70, 20);
        add(Empeñados);
        Empeñados = new JLabel("Fecha");
        Empeñados.setBounds(700, 40, 70, 20);
        add(Empeñados);
        Buscar.setEnabled(false);
        
        Inventario = new JLabel("INVENTARIO");
        Inventario.setBounds(20, 10, 150, 30);
        Inventario.setBackground(Color.LIGHT_GRAY);
        add(Inventario);
        
        Reportes = new JLabel("REPORTE DE VENTA / EMPEÑOS");
        Reportes.setBounds(380, 10, 200, 30);
        Reportes.setBackground(Color.LIGHT_GRAY);
        add(Reportes);
         
        logica.Guardado(producto, "");
        modelo.addColumn("Productos",logica.vector);
        table.setModel(modelo);
        
        logica.Guardado(cantidad, "");  
        modelo.addColumn("\nCantidad",logica.vector); 
        table.setModel(modelo); 

        logica.Guardado(precio, "");  
        modelo.addColumn("\nPrecio",logica.vector); 
        table.setModel(modelo); 

        logica.Guardado(vendidos, "");  
        modelo.addColumn("\nVendidos",logica.vector); 
        table.setModel(modelo); 

        logica.Guardado(empeñados, "");  
        modelo.addColumn("\nEmpeñados",logica.vector); 
        table.setModel(modelo);
        
        logica.Guardado2(NomPro, "");  
        modelo2.addColumn("\nNomPro",logica.vect); 
        table2.setModel(modelo2); 
        
        logica.Guardado2(CantEmp, "");
        modelo2.addColumn("\nCantEmp",logica.vect);
        table2.setModel(modelo);
        
        logica.Guardado2(Valor, "");  
        modelo2.addColumn("\nValor",logica.vect); 
        table2.setModel(modelo2); 
        
        logica.Guardado2(Status, "");  
        modelo2.addColumn("\nStatus",logica.vect); 
        table2.setModel(modelo2); 
         
        logica.Guardado2(Vencidos, "");
        modelo2.addColumn("\nVencidos", logica.vect);
        table2.setModel(modelo2);
        
        logica.Guardado2(Fecha, "");
        modelo2.addColumn("\nFecha", logica.vect);
        table2.setModel(modelo2);
       
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().compareTo("Salir")==0){
            dispose();
        }
        if(ae.getActionCommand().compareTo("Buscar")==0){
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        int interes = 0;
        if(logica.BusquedaPOS(Fecha, logica.linea)+1<minutes){
         int p = logica.BusquedaPOS(Valor, logica.linea);
         int c = logica.BusquedaPOS(CantEmp, logica.linea);
           if(logica.BusquedaNAME(Status, logica.linea).equals("Empeño")){
             String x = logica.BusquedaNAME(Vencidos, logica.linea);
             int pss = (logica.linea-1)*4;
             logica.ModificarFichero("Vencidos.txt", "Si", pss);
             interes=(((p*c)*3)/100)+interes;
         }
         
        }
        int cant, preci;
        cant = logica.BusquedaPOS(CantEmp, logica.linea);
        preci = logica.BusquedaPOS(Valor, logica.linea);
        int entero = logica.BusquedaPOS(NomPro, logica.linea);
        JOptionPane.showMessageDialog(this, "ID: "+buscar.getText()+"\n"+
                "Producto: "+logica.BusquedaNAME(NomPro, logica.linea)+"\n"+
                "Precio: "+logica.BusquedaPOS(Valor, logica.linea)+"\n"+
                "Canditad: "+logica.BusquedaPOS(CantEmp, logica.linea)+"\n"+
                "Total: "+(cant*preci)+"\n"+
                "Interes: "+interes);
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
       if(logica.Busqueda(ID, buscar.getText())==1){
              Buscar.setEnabled(true);
       }else{
            Buscar.setEnabled(false);

       }
    }

}
