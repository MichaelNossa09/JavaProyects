
package Banco;  
public class Personas {
    private int documento;
    private String nombre;
    private int edad;
    private String genero;
    private long telefono;
    private String email;

    public Personas() {
      
    }  

    public Personas(int documento, String nombre, int edad, String genero, long telefono, String email) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.telefono = telefono;
        this.email = email;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        if(documento>=0){       
            this.documento = documento;
        }else{
            System.out.println("Error en el documento");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
