
package polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       llenarPoligono();    
       mostrarResultados();
    }
    public static void llenarPoligono(){
        char respuesta;
        int op;
        do{
            do{
                 System.out.println("DIGITE QUE POLIGONO DESEA: ");
                 System.out.println("1. TRIANGULO");
                 System.out.println("2. RECTANGULO");
                 op = sc.nextInt();
            }while(op<1 || op>2);
            
            switch(op){
                case 1:
                    llenarTriangulo();
                    break;
                case 2:
                    llenarRectangulo();
                    break;  
            }
            System.out.println("Desea introducir otro poligono(s/n): ");
            respuesta = sc.next().charAt(0);
            System.out.println("");
            
            
        }while(respuesta=='s' || respuesta =='S');
    }
    public static void llenarTriangulo(){
        double lado1, lado2, lado3;
        System.out.println("LADO 1:");
        lado1 = sc.nextDouble();
        System.out.println("LADO 2:");
        lado2 = sc.nextDouble();
        System.out.println("LADO 3:");
        lado3= sc.nextDouble();
        Triangulo t = new Triangulo(lado1, lado2,lado3);
        poligono.add(t);
    }
    public static void llenarRectangulo(){
        double lado1, lado2;
        System.out.println("LADO 1");
        lado1=sc.nextDouble();
        System.out.println("LADO 2");
        lado2=sc.nextDouble();
        
        Rectangulo r = new Rectangulo(lado1, lado2);
        poligono.add(r);
    }
    public static void mostrarResultados(){
        for (Poligono poli : poligono) {
            System.out.println(poli.toString());
            System.out.println("Area= "+poli.area());
            System.out.println("");
        }
    }
    
}
