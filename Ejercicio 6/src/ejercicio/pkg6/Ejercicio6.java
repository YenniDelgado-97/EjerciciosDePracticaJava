
package ejercicio.pkg6;

import java.util.Scanner;


public class Ejercicio6 {

    
    public static void main(String[] args) {
       Scanner numero = new Scanner (System.in);
       
        System.out.println("Por favor digite el numero");
        int calcular = numero.nextInt();
       
        
        int resultado1 = calcular * 2;
        System.out.println("El doble del numero es:" + resultado1);
        
        int resultado2 = calcular  * 3;
        System.out.println("El triple del numero es: " + resultado2);
        
        
    }
    
}
