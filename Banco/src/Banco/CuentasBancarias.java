
package Banco;


public class CuentasBancarias {
    private int numeroCuenta;
    private int saldo;
    private String tipoC;
    Personas propietario;

    public CuentasBancarias() {
    }

    public CuentasBancarias(int numeroCuenta, int saldo, String tipoC, Personas propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoC = tipoC;
        this.propietario = propietario;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTipoC() {
        return tipoC;
    }

    public void setTipoC(String tipoC) {
        this.tipoC = tipoC;
    }

    public Personas getPropietario() {
        return propietario;
    }

    public void setPropietario(Personas propietario) {
        this.propietario = propietario;
    }
        
    public void consignar(int saldoConsignar){
        if(saldoConsignar > 0 ){
           saldo = saldo + saldoConsignar;
        }else{
            System.out.println("ERROR, NO POSEE UN SALDO VERDADERO");
        }
    }
    public void retirar(int saldoRetirar){
        if(saldoRetirar<=   saldo && saldoRetirar>0){
            this.saldo = saldo - saldoRetirar;
        }else{
            System.out.println("ERROR, SALDO A RETIRAR NO VALIDO");
        }
    }
    
}
