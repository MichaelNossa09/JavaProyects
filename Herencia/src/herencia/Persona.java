
package herencia;

public class Persona {

   protected String nombre;
   protected String apellido;
   protected int doc;

    public Persona() {
        doc=0;
    }

    public Persona(String nombre, String apellido, int doc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.doc = doc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }
   @Override
    public String toString(){
        return "Persona:"+
                "\n Nombre: "+nombre+
                "\n Apellido: "+apellido+
                "\n Docuemtno: "+doc;
    }
    
    
}
