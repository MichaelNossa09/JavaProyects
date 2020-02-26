package Banco;


import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
     static Scanner leeN = new Scanner(System.in);
     static Scanner leeL = new Scanner(System.in);
     static ArrayList<Personas> persona = new ArrayList<Personas>();
     static ArrayList<CuentasBancarias> cuentabancaria = new ArrayList<CuentasBancarias>();
    public static void main(String[] args){
        int document;
        int opcion=0, cantidad;
        do{
            System.out.println("1. Agregar Personas");
            System.out.println("2. Agregar Cuenta");
            System.out.println("3. Consignar");
            System.out.println("4. Retirar");
            System.out.println("5. Mostrar Cuentas");
            System.out.println("6. Salir");
            opcion = leeN.nextInt();
            
            switch(opcion){
                case 1: 
                    agregarPersona();
                    break;
                case 2: 
                    agregarCuenta();
                    break;
                case 3: 
                    mostrarCuentas(cuentabancaria);
                    System.out.println("INGRESE NUMERO DE CUENTA : ");
                    document = leeN.nextInt();
                    if(buscarC(document) != null){
                    System.out.println("INGRESE CANTIDAD A CONSIGNAR: ");
                    cantidad = leeN.nextInt();
                    buscarC(document).consignar(cantidad);
                    }else{
                    System.out.println("NUMERO DE CUENTA NO VALIDO");
                    }
                   break;
                case 4:
                    mostrarCuentas(cuentabancaria);
                    System.out.println("INGRESE NUMERO DE CUENTA: ");
                    document = leeN.nextInt();
                    if(buscarC(document) != null){
                    System.out.println("INGRESE CANTIDAD A RETIRAR: ");
                    cantidad = leeN.nextInt();
                    buscarC(document).retirar(cantidad);
                    }else{
                    System.out.println("NUMERO DE CUENTA NO VALIDO");
                    }
                    break;
                case 5:
                    mostrarPersonas(persona);
                    System.out.println("----------------------");
                    mostrarCuentas(cuentabancaria);
                    break;     
                case 6:
                    break;   
            }
           
        }while(opcion!=6);
    }
   
   public static void mostrarPersonas(ArrayList<Personas> persona){
        System.out.println("Las personas registradas actualmente son: ");
        int c=0;
        for (Personas personas : persona) {
            System.out.println("Posicion "+c+"\nDocumento: "+personas.getDocumento()+"\nNombre: "+personas.getNombre());
            c++;
   }
}
   public static void mostrarCuentas(ArrayList<CuentasBancarias> cuentabancaria){
        System.out.println("Las cuentas registradas actualmente son: ");
        int c=0;
        for (CuentasBancarias cuentaBancaria : cuentabancaria) {
            System.out.println("Posicion "+c+"\nTipo de cuenta: "+cuentaBancaria.getTipoC()+"\nNumero de Cuenta: "+cuentaBancaria.getNumeroCuenta()
                    +"\nSaldo: "+cuentaBancaria.getSaldo());
            c++;
        }
    }
   
   public static void agregarPersona(){   
        int document, edad;
        long telefono;
        String nombre, email, genero;
        System.out.println("INGRESE DOCUMENTO: ");
        document = leeN.nextInt();
        System.out.println("INGRESE NOMBRE: ");
        nombre = leeL.next();
        leeL.nextLine();
        System.out.println("INGRESE EDAD: ");
        edad = leeN.nextInt();
        System.out.println("INGRESE SEXO: ");
        genero = leeL.next();
        leeL.nextLine();
        System.out.println("INGRESE NUMERO DE TELEFONO: ");
        telefono= leeN.nextLong();
        System.out.println("INGRESE EMAIL: ");
        email = leeL.next();
        leeL.nextLine();
        if(numeroDocumento(document) == false){
            Personas x = new Personas(document, nombre, edad, genero, telefono, email);
            persona.add(x);
        }
 }
   public static void agregarCuenta(){
       int numeroCuenta, saldo, document;
       String tipoC;
       System.out.println("INGRESE NUMERO DE CUENTA: ");
       numeroCuenta = leeN.nextInt();
       System.out.println("SALDO: ");
       saldo = leeN.nextInt();
       System.out.println("TIPO DE CUENTA: ");
       tipoC = leeL.nextLine();
       mostrarPersonas(persona);
       System.out.println("INGRESE DOCUMENTO DEL PROPIETARIO");
       document = leeN.nextInt();
       if(buscarP(document)!= null){
           CuentasBancarias c = new CuentasBancarias(numeroCuenta, saldo, tipoC, buscarP(document));
           cuentabancaria.add(c);
       }else{
           System.out.println("DOCUMENTO NO VALIDO");
       }
    }
  
   public static boolean numeroDocumento(int document){
      if(persona.isEmpty()){
          return false;
      }else{
          for(int i = 0; i<persona.size();i++){
              if(persona.get(i).getDocumento() == document){
                  return true;
              }
          }
          return false; 
      }
     
    } 
   public static Personas buscarP(int document){
        for(int i = 0; i<persona.size();i++){
            if(persona.get(i).getDocumento() == document){
                return persona.get(i);
            }
        }
        return null;
    }
   
   public static CuentasBancarias buscarC(int document){
       for(int i = 0 ; i<cuentabancaria.size();i++){
           if(cuentabancaria.get(i).getNumeroCuenta() == document){
               return cuentabancaria.get(i);
           }
       }
       return null;
   }
   /*public static CuentasBancarias buscarC(int document){
   for (CuentasBancarias cuentasbancarias : cuentabancaria) {
   if(cuentabancaria.get(document).getNumeroCuenta()== document){
   return cuentabancaria.get(document);
   }
   }
   return null;
   }*/
}

