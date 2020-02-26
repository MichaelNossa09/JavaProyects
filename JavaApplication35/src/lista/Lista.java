/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.List;
import java.util.ArrayList;



/**
 *
 * @author ESTUDIANTE
 */
public class Lista {
   
   
    List<String> n1 = new ArrayList<String>();


    public static void main(String[] args) {
       
       
      
        List<String> n1 = new ArrayList<String>();// creo mi lista
       
        n1.add("juan");//add insertar en lista
        n1.add("pedro");
        n1.add("jose");
        n1.add("maria");
        n1.add(1,"sofia");
        
       
       
        System.out.println(n1);//mostrar
      
        n1.size();// tamaño de la lista
        int n = n1.size(); //asignar el tamaño de la lista a una variable
        System.out.println(n);  
   
   
        System.out.println(n1.get(0)); //muestro el dato en la pocision dada
       
       
        
        System.out.println("eliminar");
        System.out.println(n1.remove(2));//elimino el dato en la pocision dada
        System.out.println(n1.remove("jose"));//elimina el dato dado(true)
        System.out.println(n1.remove("ana"));//no se encuentra(false)
        System.out.println(n1);
        
  
        n1.clear();
        System.out.println(n1);
       
        
       
      System.out.println(n1.contains("pedro")); // esta o no esta
      System.out.println(n1.set(0, "ana")); //remplaza el dato
      System.out.println(n1);
   
       
       
    }
   
}




