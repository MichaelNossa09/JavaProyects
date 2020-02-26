
package taller3;


public class Automoviles {
    
    private String marca;
    private String modelo;
    private int cilindraje;
    private int año;
    private int kilometraje;

    public Automoviles(String marca, String modelo, int cilindraje, int año, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.año = año;
        this.kilometraje = kilometraje;
    }

   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Automovil:" + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCilindraje: " + cilindraje + "\nAnio: " + año + "\nKilometraje: " + kilometraje;
    }
    
    
    
}
