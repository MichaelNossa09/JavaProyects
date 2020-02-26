/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author KMFSC
 */
public class Company {
    File producto = new File ("Productos.txt");
    File CantEmp = new File("CantEmp.txt");
    int linea=0;
    int sw=0;
    Object [] vector=new Object[tamaño(producto, "")]; 
    Object [] vect = new Object[tamaño(CantEmp, "")];
 public static void login(){
 
    JLabel label_login = new JLabel("Usuario:");
    JTextField login = new JTextField();
 
    JLabel label_password = new JLabel("Contraseña:");
    JPasswordField password = new JPasswordField();
 
    Object[] array = { label_login,  login, label_password, password };
 
    int res = JOptionPane.showConfirmDialog(null, array, "Login", 
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE);
 
    if (res == JOptionPane.OK_OPTION) { 
       System.out.println("Usuario: " + login.getText().trim());
       System.out.println("Contraseña: " + new String(password.getPassword()));
    
        if(login.getText().trim().equals("admin")){
           if(new String(password.getPassword()).equals("admin")){
           TableAdmin admin = new TableAdmin();
           admin.setVisible(true);
           }else{
            login();
           }
        }else{
         login();
    }
}
 
 
 
 }
 
 
   public static void crearArchivo(File Ffichero,String SCadena){
        try {
           if(!Ffichero.exists()){
               Ffichero.createNewFile();
           }
          BufferedWriter Fescribe=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Ffichero,true), "utf-8"));
          Fescribe.write(SCadena + "\r\n");
          Fescribe.close();
        }catch (IOException ex) {
          System.out.println(ex.getMessage());
       } 
}

   public static void LeerFichero(File Ffichero){
        try {
       if(Ffichero.exists()){
           BufferedReader Flee= new BufferedReader(new FileReader(Ffichero));
           Flee.close();
         }
   } catch (Exception ex) {
        System.out.println(ex.getMessage());
   }
   
 }

    public  int Busqueda(File Ffichero, String nombre){
        try {
       if(Ffichero.exists()){
           BufferedReader Flee= new BufferedReader(new FileReader(Ffichero));
           String Slinea;
           sw=0;
           while((Slinea=Flee.readLine())!=null) {
           sw++;
           if(Slinea.equals(nombre)){
            linea=sw;
               return 1;
           }
           }
           Flee.close();
         }
   } catch (Exception ex) {
        System.out.println(ex.getMessage());
   }
   return 0;
 }



public int BusquedaPOS(File Ffichero, int pos){
   try {
       if(Ffichero.exists()){ 
           BufferedReader Flee= new BufferedReader(new FileReader(Ffichero));
           String Slinea;
           sw=0;
           while((Slinea=Flee.readLine())!=null) {
           sw++;
           if(sw==pos){
               return Integer.parseInt(Slinea);
           }
           }
           Flee.close();
        }
   } catch (Exception ex) {
        System.out.println(ex.getMessage());
   }
   
   return 0;
 }
public String BusquedaNAME(File Ffichero, int pos){
   try {
       if(Ffichero.exists()){
           BufferedReader Flee= new BufferedReader(new FileReader(Ffichero));
           String Slinea;
           sw=0;
           while((Slinea=Flee.readLine())!=null) {
           sw++;
           if(sw==pos){
               return Slinea;
           }
           }
           Flee.close();
        }
   } catch (Exception ex) {
        System.out.println(ex.getMessage());
   }
        return null;
 }



 public static  void ModificarFichero(String nomart,String Snuevalinea,int pos){
        try {
        RandomAccessFile archivo = new RandomAccessFile(nomart, "rw");
        archivo.seek(pos);
        archivo.writeBytes(Snuevalinea);
        archivo.close();/* Cerrar el archivo importante */
    } catch (IOException ex) {
        Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
    }


 
   
     
 }
 
 public  int tamaño(File Ffichero, String nombre){
   try {
       if(Ffichero.exists()){
           BufferedReader Flee= new BufferedReader(new FileReader(Ffichero));
           String Slinea;
           sw=0;
           while((Slinea=Flee.readLine())!=null) {
           sw++;   
           }
           Flee.close();
         }
   } catch (Exception ex) {
        System.out.println(ex.getMessage());
   }
   return sw;
 }
 public void Guardado(File Ffichero, String nombre){
   try {
       if(Ffichero.exists()){
           BufferedReader Flee= new BufferedReader(new FileReader(Ffichero));
           String Slinea;
           sw=0;
           while((Slinea=Flee.readLine())!=null) {
           vector[sw]=Slinea;
           sw++;   
           }
           Flee.close();
         }
   } catch (Exception ex) {
           System.out.println(ex.getMessage());
   }
 
 }
  public void Guardado2(File Ffichero, String nombre){
   try {
       
       if(Ffichero.exists()){
           BufferedReader Flee= new BufferedReader(new FileReader(Ffichero));
           String Slinea;
           sw=0;
           while((Slinea=Flee.readLine())!=null) {
           vect[sw]=Slinea;
           sw++;               
           }

           Flee.close();
         }
   } catch (Exception ex) {
        System.out.println(ex.getMessage());
   }
 
 }

}
