
package herencia;


public class Estudiante extends Persona{
    private int  cod;
    private String programa;

    public Estudiante() {
    }

    public Estudiante(int cod, String programa, String nombre, String apellido, int doc) {
        super(nombre, apellido, doc);
        this.cod = cod;
        this.programa = programa;
    }
     

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
   @Override
    public String toString(){
        return "ESTUDIANTE: "+
                "\n Nombre: "+nombre+
                "\n Apellido: "+apellido+
                "\n Documento: "+doc+
                "\n Codigo: "+cod +
                "\n Programa: "+programa;
    }    
    
   
}
