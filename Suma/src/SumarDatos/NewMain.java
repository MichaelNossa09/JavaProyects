/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SumarDatos;

import java.util.Scanner;



public class NewMain {

 
    public static void main(String[] args) {
  
      //  cantidadDinero();
        compañiaCarros();
    }   
    
    public static void cantidadDinero(){
        Scanner entrada = new Scanner(System.in);
        float dineroG, dineroL, dineroJ, suma;
        
        System.out.println("Ingrese la cantidad de dinero que tiene Guillermo: ");
        dineroG = entrada.nextFloat();
        dineroL = dineroG/2;
        dineroJ = (dineroG + dineroL) / 2;
        
        suma = dineroG + dineroL + dineroJ;
        System.out.println("La cantidad de dinero que tienen entre los 3 es de:\n$"+suma);
    }
    public static void compañiaCarros(){
        Scanner entrada = new Scanner(System.in);
        float salarioM = 1000f, comision = 150f, precio, comision2, contador=0f, total;
        int cantidad;
        String nombre;
        System.out.println("Ingrese el nombre del vendedor: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la cantidad de autos vendidos: ");
        cantidad = entrada.nextInt();
        for(int i = 0; i<cantidad;i++){
            System.out.println("Ingrese el valor del auto numero "+(i+1)+": ");
            precio = entrada.nextFloat();
            comision2 = (float) (0.05 * precio);
            contador = contador + comision2; 
        }
        total = salarioM + (150 * cantidad) + contador;

        System.out.println("El Señor(a):"+nombre+"\nse le debe pagar por el mes: $"+total);
    }
}
