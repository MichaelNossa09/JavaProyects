/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube;

/**
 *
 * @author Lenovo
 */
public class Persona {
    private final String nombre;
    private int edad;
    
 //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
    
}

