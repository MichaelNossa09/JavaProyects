
import java.util.ArrayList;
import java.util.Scanner;


public class ConjuntoLibrosRevistas<E>{
    private ArrayList<E> Lista;
    
    static ArrayList<Libro> x = new ArrayList<>();
    static ArrayList<Revista> r = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        do{
            System.out.println("MENU:");
            System.out.println("1. Añadir Libro.");
            System.out.println("2. Añadir Revista.");
            System.out.println("3. Eliminar Libro");
            System.out.println("4. Eliminar Revista.");
            System.out.println("5. Libro Y Revista con mayor calificacion.");
            System.out.println("6. Libro Y Reviste con menor calificacion.");
            System.out.println("7. Mostrar Conjunto.");
            System.out.println("8. Salir");
            op=sc.nextInt();
            
           switch(op){
               case 1:
                   String titulo, autor;
                   int nP, cal;
                   System.out.println("Ingrese Titulo: ");
                   titulo = sc.next();
                   System.out.println("Ingrese nombre del autor: ");
                   autor=sc.next();
                   System.out.println("Ingrese numero de páginas: ");
                   nP=sc.nextInt();
                   System.out.println("Ingrese calificacion (0-10): ");
                   cal = sc.nextInt();
                   if(cal>=0 && cal<=10){
                    
                   }else{
                       System.out.println("ERROR, INGRESE UNA CALIFICACION VALIDA.");
                   }
                   break;
               case 2:
                   String titulo1,titulo2,titulo3;
                   int edicion, nA;
                   System.out.println("INGRESE EDICION: ");
                   edicion=sc.nextInt();
                   System.out.println("INGRESE NUMERO DE ARTICULOS: ");
                   nA=sc.nextInt();
                   System.out.println("INGRESE TITULO DE LOS 3 MEJORES ARTICULOS: ");
                   System.out.println("INGRESE TITULO 1:");
                   titulo1=sc.next();
                   System.out.println("INGRESE TITULO 2: ");
                   titulo2=sc.next();
                   System.out.println("INGRESE TITULO 3:");
                   titulo3=sc.next();
                   System.out.println("INGRESE NUMERO DE PAGINAS: "); 
                   nP=sc.nextInt();
                   System.out.println("INGRESE CALIFICACION: ");
                   cal=sc.nextInt();
                   if(cal>=0 && cal<=10){
                      r.add(new Revista(edicion, nA, titulo1, titulo2, titulo3, nP, cal));
                   }
                   break;
               case 3:
                   System.out.println("INGRESE NOMBRE DEL LIBRO A ELIMINAR: ");
                   titulo=sc.next();
                   for(int i =0; i<x.size();i++){
                       if(x.get(i).getTitulo().equals(titulo)){
                           x.remove(i);
                       }else{
                           System.out.println("Error, no se pudo eliminar.");
                       }
                   }
                   break;
               case 4:
                   System.out.println("INGRESE EDICION A ELIMINAR: ");
                   edicion=sc.nextInt();
                   for(int i=0;i<r.size();i++){
                       if(r.get(i).getEdicion() == edicion){
                           r.remove(i);
                       }else{
                           System.out.println("Error, no se pudo eliminar.");
                       }
                   }
                   break;
               case 5:     
                   int meno=1999999999;
                   int mayor = 0;
                   int mayor1 = 0;
                   for(int i = 0; i<x.size();i++){
                       for(int j=0;j<r.size();j++){
                           if(x.get(i).getCal()>mayor || x.get(i).getCal()<meno){
                                mayor=x.get(i).getCal();
                                meno=x.get(i).getCal();
                                System.out.println("El Libro con mayor Calificacion es: "+x.get(i).getTitulo()+" Con una calificacion de: "+mayor);
                                System.out.println("El Libro con menor Calificacion es: "+x.get(i).getTitulo()+" Con una calificacion de: "+meno);
                           }
                           
                       }
                 }
                   break;
               case 6:
                   int menor=15, menor1=15;
                   for(int i=0;i<x.size();i++){
                       if(x.get(i).getCal()<menor){
                           menor=x.get(i).getCal();
                           System.out.println("El Libro con menor calificacion es: "+x.get(i).getTitulo()+" Con una calificacion de: "+menor);
                       }
                   }
                   for(int j=0;j<r.size();j++){
                       if(r.get(j).getCal()<menor1){
                           menor1=r.get(j).getCal();
                           System.out.println("La revista con menor calificacion es: "+r.get(j).getEdicion()+" Con una calificacion de: "+menor1);
                       }
                   }
                   break;
               case 7: 
                   System.out.println(""+x);
                   System.out.println(""+r);
                   break;
           }     
         
            
        }while(op!=8);
    }
    
    
}
