
package herencia;

import java.util.Scanner;


public class Principal {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
       Estudiante[] est = new Estudiante[100];
       Empleado[] empl = new Empleado[100];
       Egresados[] egre = new Egresados[100];
       int op;
       do{
           System.out.println("1. AGREGAR ESTUDIANTE:");
           System.out.println("2. AGREGAR EMPLEADO:");
           System.out.println("3. AGREGAR EGRESADO:");
           System.out.println("4. MOSTRAR");
           op = sc.nextInt();
           
           switch(op){
               case 1: System.out.println("CODIGO: ");
           }
          }while(op!=0);
       
    }
    
    

}