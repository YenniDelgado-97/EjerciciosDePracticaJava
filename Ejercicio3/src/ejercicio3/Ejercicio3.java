
package ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {


    public static void main(String[] args) {
        
        /*Scanner dinero = new Scanner (System.in);
        
        double sueldo = 1000;
        
        System.out.println("");
    
        sueldo -= 234;
        sueldo -= 34.45;
        sueldo -= 12.99;
        
        System.out.println("el saldo actual es:" + sueldo);
        */
        Scanner dinero = new Scanner (System.in);
        
        System.out.println("cuanto dinero posee:");
        double sueldo = dinero.nextDouble();
        
        System.out.println("cuanto dinero desea retirar");
        double gasto = dinero.nextDouble();
        
        sueldo -= gasto;
        System.out.println("El saldo actual es" + sueldo);
        
        System.out.println("cuanto dinero desea retirar");
        double gasto2 = dinero.nextDouble();
        
        sueldo -= gasto2;
        System.out.println("El saldo actual es" + sueldo);
        
        System.out.println("cuanto dinero desea retirar");
       double gasto3 = dinero.nextDouble();
       
       sueldo -= gasto3;
       
       System.out.println("El saldo actual es" + sueldo);
    
               
        
     
    }
    
}
