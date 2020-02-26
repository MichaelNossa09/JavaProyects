/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Principal {

    public static int indiceCocheMBarato(Ejercicio3 coches[]){
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for(int i=1;i<coches.length;i++){
            if(coches[i].getPrecio()< precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        
        return indice;
    }
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String marca;
        String modelo;
        float precio;
        int numeroVehiculos, indiceBarato;
        
        System.out.println("Digite la cantidad de vehículos: ");
        numeroVehiculos = entrada.nextInt();
        
        //Creamos los objetos para los coches
        Ejercicio3 coches[] = new Ejercicio3[numeroVehiculos];
        
        for(int i=0; i<coches.length;i++){
            entrada.nextLine();
            System.out.println("Digite las caracteristicas del coche "+(i+1)+":");
            System.out.println("Introduzca marca: ");
            marca = entrada.nextLine();
            System.out.println("Introduzca modelo: ");
            modelo = entrada.nextLine();
            System.out.println("Introduzca el precio: ");
            precio = entrada.nextFloat();
            
            coches[i] = new Ejercicio3(marca,modelo,precio);
            
        }
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
    
}
