/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradesaverage;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class GradesAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int nota=0;
      Scanner s= new Scanner(System.in);
      int numStudent;
      int suma=0;
      System.out.println("Ingrese numero de estudiantes: ");
      numStudent = s.nextInt();
      System.out.println("CALIFICACIONES DE LOS ESTUDIANTES\n");
        int[] calif = new int [numStudent];
      for(int i=0;i<numStudent;i++){
          System.out.println("INGRESE NOTA: ");
          nota =s.nextInt();
          if(nota<=100){
              calif[i]=nota;
          }else{
              System.out.println("Error... Ingrese un numero dentro del rango(0-100)");
             i--;
         }
    }for (int x=0;x<numStudent;x++){
          suma+=calif[x];
      } 
     float Averague = suma/numStudent;
      
        System.out.println("The averague is\n"+Averague);
    }
    
}
