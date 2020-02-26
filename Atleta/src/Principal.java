
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Principal {

    public static int mejorTiempo(Atleta atletas[]){
        float tiempo;
        int indice = 0;
        
        tiempo = atletas[0].getTiempo();
        for(int i=1;i<atletas.length;i++)
        {
            if(atletas[i].getTiempo()<tiempo){
                tiempo = atletas[i].getTiempo();
                indice = i;
            }
            
        }
        return indice;
    }
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nombre;
        float tiempo;
        int numero;
        int numeroAtletas, indiceMejor;
        
        System.out.println("Digite la cantidad de participantes: ");
        numeroAtletas = entrada.nextInt();
        
        //Creamos objetos para atletas
        
       Atleta atletas[] = new Atleta[numeroAtletas];
       
       for(int i=0;i<atletas.length;i++){
           entrada.nextLine();
           System.out.println("Digite caracteristicas del atleta "+(i+1)+":");
           System.out.println("Introduzca el número del atleta: ");
           numero = entrada.nextInt();
           entrada.nextLine();
           System.out.println("Introduza el nombre del atleta: ");
           nombre = entrada.nextLine();
           System.out.println("Introduzca el tiempo del atleta: ");
           tiempo = entrada.nextFloat();
           
           
           atletas[i] = new Atleta(numero,nombre,tiempo);
           
       }
       indiceMejor = mejorTiempo(atletas);
        System.out.println("\nEl ganador es: ");
        System.out.println(atletas[indiceMejor].mostrarDatos());
    }
    
}
