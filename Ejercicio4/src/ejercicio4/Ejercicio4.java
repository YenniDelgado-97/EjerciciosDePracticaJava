
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner cosita =new Scanner (System.in);
        System.out.println("POr favor digite el vlor de x:");
        float x = cosita.nextFloat();
        
        x= ((7*(3*x+2))-((5*(4*x-3))-1))/4;
        System.out.println("El vlor final de x es: " + x);
    
    }
    
}
