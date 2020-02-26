/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Promedio {
      
    static Scanner sc = new Scanner(System.in);
    static int suma=0;
    static float prome=0;
    static int sumac=0;
    public static void main(String[] args) {
        System.out.println("Ingrese cantidad de materias: ");
        int cant = sc.nextInt();
        for(int i=0;i<cant;i++){
            System.out.println("INGRESE NOTA "+i+":");
            int nota = sc.nextInt();
            System.out.println("INGRESE CREDITO: ");
            int cred = sc.nextInt();
            
            suma+=(nota*cred);
            sumac+=cred;
        }
        prome =(float) suma/sumac;
        System.out.println("El proomedio es: "+prome);
    }
    
}
