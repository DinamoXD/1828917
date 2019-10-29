
package senasalud;

import java.util.Scanner;

public class Senasalud {

  
    public static void main(String[] args) {
      String nom;
      
        Scanner nombre =new Scanner (System.in); 
        System.out.println("Hola bienvenido, ingrese su nombre");
        nom=nombre.next();
        
        String ape;
        Scanner apellido = new Scanner (System.in);
        System.out.println("Digite el apellido");
        ape=apellido.next();
        
        
        int eda;        
        Scanner edad = new Scanner (System.in);
        System.out.println("Ingresa la edad");
        eda=edad.nextInt();
        
       
        
        
        System.out.println("su nombre es:" + nom);
        System.out.println("Su apellido es:" + eda);
        System.out.println("Su edad es:" + ape);
      
    }
    
    
    
}
