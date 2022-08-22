
package ejercicio2.pkg2;

import java.util.Scanner;


public class Ejercicio22 {

    
    public static void main(String[] args) {
       Scanner nota = new Scanner(System.in);
       
       System.out.println("POr favor diguite la nota 1");
        float nota1 = nota.nextFloat();
        
        System.out.println("Digite su 2 nota");
        float nota2 = nota.nextFloat();
        
        System.out.println("Digite su 3 nota");
        float nota3 = nota.nextFloat();
        
        
        
        float promedio = (nota1 + nota2 + nota3 )/ 3;
        
        promedio += 1;
        
        System.out.println("El promedio de sus notas es: " + promedio);
    }
    
}
