
package CompraVenta;

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

public class logica {
    File producto = new File ("Productos.txt");
    File CantidadEmpeñados = new File("cantidademp.txt");
    int linea=0;
    int sw=0;
    Object [] array1=new Object[Tamaño(producto, "")]; 
    Object [] array2= new Object[Tamaño(CantidadEmpeñados, "")];

   public static void crear(File archivo,String Cadena){
        try {
           if(!archivo.exists()){
               archivo.createNewFile();
           }
          BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo,true), "utf-8"));
          bw.write(Cadena + "\r\n");
          bw.close();
        }catch (IOException ex) {
          System.out.println(ex.getMessage());
       } 
}

 public static void Leer(File archivo){
        try {
       if(archivo.exists()){
           BufferedReader br= new BufferedReader(new FileReader(archivo));
           br.close();
         }
   } catch (Exception ex) {
        System.out.println(ex.getMessage());
   }
   
 }

 public  int Busqueda(File archivo, String nombre){
        try {
       if(archivo.exists()){
           BufferedReader br= new BufferedReader(new FileReader(archivo));
           String Linea;
           sw=0;
           while((Linea=br.readLine())!=null) {
           sw++;
           if(Linea.equals(nombre)){
            linea=sw;
               return 1;
           }
           }
           br.close();
         }
   } catch (Exception ex) {
        System.out.println(ex.getMessage());
   }
   return 0;
 }



public int BusquedaInt(File archivo, int pos){
   try {
       if(archivo.exists()){
           BufferedReader br= new BufferedReader(new FileReader(archivo));
           String Linea;
           sw=0;
           while((Linea=br.readLine())!=null) {
           sw++;
           if(sw==pos){
               return Integer.parseInt(Linea);
           }
           }
           br.close();
        }
   } catch (Exception ex) {
        System.out.println(ex.getMessage());
   }
   
   return 0;
 }
public String BusquedaString(File archivo, int pos){
   try {
       if(archivo.exists()){
           BufferedReader br= new BufferedReader(new FileReader(archivo));
           String Linea;
           sw=0;
           while((Linea=br.readLine())!=null) {
           sw++;
           if(sw==pos){
               return Linea;
           }
           }
           br.close();
        }
   } catch (Exception ex) {
        System.out.println(ex.getMessage());
   }
        return null;
 }



 public static  void Modificar(String nomart,String Snuevalinea,int pos){
        try {
        RandomAccessFile raf = new RandomAccessFile(nomart, "rw");
        raf.seek(pos);
        raf.writeBytes(Snuevalinea);
        raf.close();/* Cerrar el archivo importante */
    } catch (IOException ex) {
        Logger.getLogger(logica.class.getName()).log(Level.SEVERE, null, ex);
    }


 
   
     
 }
 
 public  int Tamaño(File archivo, String nombre){
   try {
       if(archivo.exists()){
           BufferedReader br= new BufferedReader(new FileReader(archivo));
           String Linea;
           sw=0;
           while((Linea=br.readLine())!=null) {
           sw++;   
           }
           br.close();
         }
   } catch (Exception ex) {
        System.out.println(ex.getMessage());
   }
   return sw;
 }
 public void GuardadoArray1(File archivo, String nombre){
   try {
       if(archivo.exists()){
           BufferedReader br= new BufferedReader(new FileReader(archivo));
           String Linea;
           sw=0;
           while((Linea=br.readLine())!=null) {
           array1[sw]=Linea;
           sw++;   
           }
           br.close();
         }
   } catch (Exception ex) {
           System.out.println(ex.getMessage());
   }
 
 }
  public void GuardadoArray2(File archivo, String nombre){
   try {
       
       if(archivo.exists()){
           BufferedReader br= new BufferedReader(new FileReader(archivo));
           String Linea;
           sw=0;
           while((Linea=br.readLine())!=null) {
           array2[sw]=Linea;
           sw++;               
           }

           br.close();
         }
   } catch (Exception ex) {
        System.out.println(ex.getMessage());
   }
 
 }
}
