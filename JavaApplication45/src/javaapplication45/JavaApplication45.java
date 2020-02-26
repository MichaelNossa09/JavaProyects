
package javaapplication45;

import java.util.ArrayList;

public class JavaApplication45 {
    
            
    public static void main(String[] args) {
       ArrayList<String> nombres = new ArrayList<String>();
       ArrayList<String> desorden = new ArrayList<String>();
       nombres.add(" Luis Carlos   ");
       nombres.add(" Andersons     ");
       nombres.add(" Juan Carlos   ");
       nombres.add(" Diogenes De Jesus");
       nombres.add(" Yeimer Jose   ");
       nombres.add(" Gustavo Andres");
       nombres.add(" Leandro Javier");
       nombres.add(" Javier Eduardo");
       nombres.add(" Yojay Esteban ");
       nombres.add(" Luis Carlos   ");
       nombres.add(" Carlos Andres ");
       nombres.add(" Andres Alberto");
       nombres.add(" Gustavo Adolfo");
       nombres.add(" Etelvina Rosa ");
       nombres.add(" Luis Mario    ");
       nombres.add(" David Miguel  ");
       nombres.add(" Juan Daniel   ");
       nombres.add(" Andres Felipe ");
       nombres.add(" Elkin De Jesus");
       nombres.add(" Michael Jose  ");
       nombres.add(" Andres Camilo ");
       nombres.add(" Roiman Alberto");
       nombres.add(" Alex Pio      ");
       nombres.add(" Ever Jose     ");
       nombres.add(" Mayeleen      ");
       nombres.add(" Daniel Alfonso");
       nombres.add(" Sebastian     ");
       nombres.add(" Yoider Jose   ");
       
      
       for(int i=0;i<28;i++){
           System.out.print((i+1)+"."+nombres.get(i)+"\t");
           for(int j=5;j<28;j=j+6){
               if(i==j){
                   System.out.print("\n");
               }
           }
       }
        System.out.println("\n");
    }
    
}
