//Hallar el promedio de tres notas 
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        //declarar variables
        
        Scanner notas = new Scanner(System.in);
        
        float nota1;
        float nota2;
        float nota3;
        float promedio;
        
        System.out.println("Digite su 1 nota");
        nota1 = notas.nextFloat();
        
        System.out.println("Digite su 2 nota");
        nota2 = notas.nextFloat();
        
        System.out.println("Digite su 3 nota");
        nota3 = notas.nextFloat();
        
        promedio = (nota1 + nota2 + nota3 )/ 3;
        System.out.println("El promedio de sus notas es: " + promedio);
        
        
        
     
    }
    
}
