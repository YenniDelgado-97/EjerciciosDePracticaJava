
package consol;

import java.util.Scanner;


public class CONSOL {


    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        char letra; 
        System.out.println("digite una letra");
        letra = entrada.nextLine() .charAt(1);
        System.out.println("La letra es:" + letra );
    }
    
} 
