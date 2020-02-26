
package taller3;


public interface Interface {
  public abstract void insertar(String modelo, String marca, int cilindraje, int año, int kilometraje);
  public abstract Automoviles quitar(String clave);
   public abstract void listar();
  public abstract void eliminar(String clave);
  public abstract Automoviles buscar(String clave);
  public abstract void eliminartodo();
  
}
