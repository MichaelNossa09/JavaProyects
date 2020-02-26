
package estatico;


public class Estatico {

    private String frase = "1";
    
    public static int sumar(int n1, int n2){
        int suma = n1+n2;
        return suma;
    }
    
    public static void main(String[] args) {
       Estatico ob1 = new Estatico();  
       Estatico ob2 = new Estatico(); 
       
       ob2.frase = "2";
       System.out.println(ob1.frase);
       System.out.println(ob2.frase);
       System.out.println("La suma es: "+Estatico.sumar(5, 9));
    }
    
}
