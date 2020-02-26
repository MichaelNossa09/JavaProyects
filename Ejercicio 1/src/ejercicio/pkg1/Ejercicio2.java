/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

/**
 *
 * @author Lenovo
 */
public class Ejercicio2 {
    //Atributos
    private int ejeX;
    private int ejeY;
    //Metodos
    //Constructor
    public Ejercicio2(int ejeX, int ejeY){
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }
    //Mover hacia arriba
    public void moverArriba(){
        ejeY += 1;
        System.out.println("DIRECCION HACIA ADELANTE");
        System.out.println("POSICION: ("+ejeX+","+ejeY+")");
    }
    //Mover hacia abajo
    public void moverAbajo(){
        ejeY -= 1;
        System.out.println("DIRECCION HACIA ABAJO");
        System.out.println("POSICION: ("+ejeX+","+ejeY+")");
    }
    //Mover hacia derecha
    public void moverDerecha(){
        ejeX += 1;
        System.out.println("DIRECCION HACIA DERECHA");
        System.out.println("POSICION: ("+ejeX+","+ejeY+")");
    }
    //Mover hacia arriba
    public void moverIzquierda(){
        ejeX -= 1;
        System.out.println("DIRECCION HACIA IZQUIERDA");
        System.out.println("POSICION: ("+ejeX+","+ejeY+")");
    }
    //Getter posicion X
    public int getEjeX(){
        return ejeX;
    }
    //Getter posicion Y
    public int getEjeY(){
        return ejeY;
    }
    
    
    
    
    
}
