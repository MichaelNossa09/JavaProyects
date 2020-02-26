
package herencia;

public class Empleado extends Persona{
    private int cod;
    private String cargo;

    public Empleado() {
    }

    public Empleado(int cod, String cargo, String nombre, String apellido, int doc) {
        super(nombre, apellido, doc);
        this.cod = cod;
        this.cargo = cargo;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
  //  @Override
  //  public String toString(){
        
   // }
    
}
