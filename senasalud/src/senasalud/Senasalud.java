
package senasalud;

import java.util.Scanner;

public class Senasalud {

  
    public static void main(String[] args) {
      String nom;
        Scanner nombre =new Scanner (System.in); 
        System.out.println("Hola bienvenido, ingrese su nombre");
        nom=nombre.next();
        System.out.println("su nombre es:" + nom);
    }
    
}
