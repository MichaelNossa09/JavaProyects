
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Ventana extends JFrame implements ActionListener, KeyListener{
   
    public JButton boton1;
    public JButton boton2;
    public JButton boton3;
    public JButton boton4;
    public JButton boton5;
    public JButton boton6;
    public JButton boton7;
    public JButton boton8;
    public JButton boton9;
    public JButton boton10;
    public JButton boton11;
    public JButton boton12;
    public JButton boton13;
    public JButton boton14;
    public JButton boton15;
    public JButton boton16;
    public JButton boton17;
    public JButton boton18;
    public JButton boton19;
    public JButton boton20;
    public JTextField jtf;
    public static int dato=0;
    public int valor=0;
    public Double a;
    public Double b;
    public String operador;
    public boolean sw;
    public  Ventana() throws HeadlessException {
        
        super();
        this.setTitle("Mi nueva ventana");
        this.setBounds(550, 250, 500, 500);
        this.setLayout(null);
       // this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        sw=true;
        boton1 = new JButton("CE");
        boton1.setBounds(20, 20, 50,30);
        boton1.addActionListener(this);
        add(boton1);
        boton2 = new JButton("C");
        boton2.setBounds(70, 20, 50,30);
        boton2.addActionListener(this);
        add(boton2);
        boton3 = new JButton("<=");
        boton3.setBounds(120, 20,50, 30);
        boton3.addActionListener(this);
        add(boton3);
        boton4 = new JButton("/");
        boton4.setBounds(170, 20, 50, 30);
        boton4.addActionListener(this);
        add(boton4); 
        boton5 = new JButton("7");
        boton5.setBounds(20, 50, 50, 30);
        boton5.addActionListener(this);
        add(boton5);
        boton6 = new JButton("8");
        boton6.setBounds(70, 50, 50, 30);
        boton6.addActionListener(this);
        add(boton6);
        boton7 = new JButton("9");
        boton7.setBounds(120, 50, 50, 30);
        boton7.addActionListener(this);
        add(boton7);
        boton8 = new JButton("X");
        boton8.setBounds(170, 50, 50, 30);
        boton8.addActionListener(this);
        add(boton8);
        boton9 = new JButton("4");
        boton9.setBounds(20, 80, 50, 30);
        boton9.addActionListener(this);
        add(boton9);
        boton10 = new JButton("5");
        boton10.setBounds(70, 80, 50, 30);
        boton10.addActionListener(this);
        add(boton10);
        boton11 = new JButton("6");
        boton11.setBounds(120, 80, 50, 30);
        boton11.addActionListener(this);
        add(boton11);
        boton12 = new JButton("-");
        boton12.setBounds(170, 80, 50, 30);
        boton12.addActionListener(this);
        add(boton12); 
        boton13 = new JButton("1");
        boton13.setBounds(20, 110, 50, 30);
        boton13.addActionListener(this);
        add(boton13);
        boton14 = new JButton("2");
        boton14.setBounds(70, 110, 50, 30);
        boton14.addActionListener(this);
        add(boton14);
        boton15 = new JButton("3");
        boton15.setBounds(120, 110, 50, 30);
        boton15.addActionListener(this);
        add(boton15);
        boton16 = new JButton("+");
        boton16.setBounds(170, 110, 50, 30);
        boton16.addActionListener(this);
        add(boton16);
        boton17 = new JButton("+/-");
        boton17.setBounds(20, 140, 50, 30);
        boton17.addActionListener(this);
        add(boton17);
        boton18 = new JButton("0");
        boton18.setBounds(70, 140, 50, 30);
        boton18.addActionListener(this);
        add(boton18); 
        boton19 = new JButton(",");
        boton19.setBounds(120, 140, 50, 30);
        boton19.addActionListener(this);
        add(boton19);
        boton20 = new JButton("=");
        boton20.setBounds(170, 140, 50, 30);
        boton20.addActionListener(this);
        add(boton20);
     
      //  JLabel j1 = new JLabel("Nombre: ");
       // j1.setBounds(20, 60, 60, 30);
       // add(j1);
        
      jtf = new JTextField("0");
      jtf.setBounds(20, 170, 200, 30);
      jtf.addKeyListener(this);
      add(jtf);
        
    /*    String[] as= new String[5];
        as[0] ="Opcion 1";
        as[1] ="Opcion 2";
        as[2] ="Opcion 3";
        as[3] ="Opcion 4";
        as[4] ="Opcion 5";
        c = new JComboBox(as);
        c.setBounds(130, 100, 100, 30);
        add(c);
      */  
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String c = e.getActionCommand();
        if(sw){
        if(c.compareTo("9")<=0 && c.compareTo("0")>=0){
            if(jtf.getText().compareTo("0")==0){
             jtf.setText(c);
            }else{
                jtf.setText(jtf.getText()+c);
                if(operador=="+"){
                  
                    
                       
                
                }
            }
        }
        }else{
            jtf.setText(c);
            sw=true;
        }
        if(c.compareTo("<=")==0){
            if(jtf.getText().length()>0){
            jtf.setText(jtf.getText().substring(0, jtf.getText().length()-1));
            }
            if(jtf.getText().length()==0){
                jtf.setText("0");
            }
        }
        if(c.compareTo("+")==0){
           // jtf.setText(a.toString());
           operador=c;
           dato = Integer.parseInt(jtf.getText());
       }
        if(c.compareTo("-")==0){
            operador=c;
            dato = Integer.parseInt(jtf.getText());
            jtf.setText("0");
        }
        if(c.compareTo("C")==0){
            dato = 0;
            jtf.setText("0");
        }
        if(c.compareTo("CE")==0){
            if(jtf.getText().trim().length()>1){
                jtf.setText(jtf.getText().substring(0, jtf.getText().trim().length()-1));
            }else{
                jtf.setText("0");
            }
            
        }
        if(c.compareTo("X")==0){
            operador=c;
            dato = Integer.parseInt(jtf.getText());
        }
        if(c.compareTo("=")==0){
            switch(operador){
                case "+":
                    valor = dato + Integer.parseInt(jtf.getText());
                    jtf.setText(String.valueOf(valor));
                    valor=0;
                    dato=0;
                    break;
                case "-":
                    valor = dato - Integer.parseInt(jtf.getText());
                    jtf.setText(String.valueOf(valor));
                    valor=0;
                    dato=0;
                    break;
            }
           
           
    
    }
    

    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        jtf.setText(ke.toString());
    }
   
 }
    

