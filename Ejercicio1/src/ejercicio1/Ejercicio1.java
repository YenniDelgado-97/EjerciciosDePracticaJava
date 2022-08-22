//Haz un programa que calcule el área de un triángulo

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {
        //declarar variables
        
        Scanner triangulo = new Scanner(System.in);
        float base;
        float altura;
        float area;
        
        System.out.println("POr favor digite la base:");
        base = triangulo.nextFloat();
        
        System.out.println("POr favor digite la altura:");
        altura = triangulo.nextFloat();
        
        
        area = (base* altura)/2;
        System.out.println("El area del triangulo es: " + area);
        
        
          
        
    }
    
}
