
package matriz1;

import java.util.Scanner;


public class Matriz1 {

    public static void main(String[] args) {
        Scanner solicitud = new Scanner (System.in);
        System.out.println("Digite el vlor de las filas");
        
        int a = solicitud.nextInt();
        
        System.out.println("Digite le vlor de las columnas ");
        int b= solicitud.nextInt();
        
        int matriz[][] = new int [a][b];
        
        // i filas j columnas
        
        for(int i=0;i<matriz.length; i++){
            for(int j = 0 ; j<matriz[0].length; j++){
                matriz [i][j]= (i*matriz.length) + (j + 1);
                
                System.out.print(matriz[i][j]+ "  ");
            
        }
            System.out.println(" ");    
    }
    
}
}
