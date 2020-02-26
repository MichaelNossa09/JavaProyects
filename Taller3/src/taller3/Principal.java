
package taller3;
import java.util.*;


public class Principal{
     
   static Scanner sc = new Scanner(System.in);
   static HashMap<Integer, Automoviles> autos = new HashMap<Integer, Automoviles>();
   static Principal c = new Principal();
   static int key = 0;
    public static void main(String[] args) {
            String marca, modelo;
            int cilindraje , año, kilometraje, clave;
      
         int op;
         do{
             System.out.println("MENU:");
             System.out.println("1. AÑADIR");
             System.out.println("2. QUITAR");
             System.out.println("3. LISTAR");
             System.out.println("4. ELIMINAR");
             System.out.println("5. BUSCAR");
             System.out.println("6. ELIMINAR TODOS");
             System.out.println("7. SALIR");
             op=sc.nextInt();
             
             switch(op){
                 case 1:
                     System.out.println("INGRESE MARCA:");
                     marca = sc.next();
                     System.out.println("INGRESE MODELO:");
                     modelo = sc.next();
                     System.out.println("INGRESE AÑO:");
                     año = sc.nextInt();
                     System.out.println("INGRESE CILINDRAJE:");
                     cilindraje = sc.nextInt();
                     System.out.println("INGRESE KILOMETRAJE:");
                     kilometraje = sc.nextInt();
                     key++;
                     c.insertar(modelo, marca, cilindraje, año, kilometraje);
                     break;
                 case 2:    
                     c.listar();
                     System.out.println("INGRESE CLAVE A QUITAR:");       
                     clave = sc.nextInt();
                     Automoviles elim = c.buscar(new Integer(clave));
                     if(elim != null){
                         c.quitar(new Integer(clave));
                     }else{
                         System.out.println("CLAVE NO ENCONTRADA.");
                     }
                     break;
                 case 3:    
                     System.out.println(" ");
                     c.listar();
                     break;
                 case 4: 
                     c.listar();
                     System.out.println("INGRESE CLAVE A ELIMINAR: ");
                     clave = sc.nextInt();
                     c.eliminar(new Integer(clave));
                     break;
                 case 5:   
                     System.out.println("INGRESE CLAVE A BUSCAR: ");
                     clave = sc.nextInt();
                     if(c.buscar(new Integer(clave))!=null){
                         System.out.println("SE ENCONTRO");
                     }else{ 
                         System.out.println("NO SE ENCONTRO");
                     }
                     break;
                 case 6:    
                     c.eliminartodo();
                     break;
                 case 7:     
                     break;
             }
            }while(op!=7);
       }

    public void insertar(String modelo, String marca, int cilindraje, int año, int kilometraje){
        autos.put(key, new Automoviles(marca, modelo, cilindraje, año, kilometraje));
        System.out.println(" ");
    }
   
    public Automoviles quitar(int clave){
        if(autos.containsKey(clave)){
            Automoviles a1 = autos.get(clave);
            autos.remove(clave);    
        }
        return null;
    }
    public void listar(){
        System.out.println(autos);
    }
    public void eliminar(int clave){
        if(autos.containsKey(clave)){
            autos.remove(clave);
        }
    }
    
   public Automoviles buscar(int clave){
       if(autos.get(clave) != null){
           return autos.get(clave);
       }
       return null;
   }
   public void eliminartodo(){
       autos.clear();
   }
  
 
}
