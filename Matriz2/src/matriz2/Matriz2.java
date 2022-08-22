
package matriz2;

import java.util.Scanner;


public class Matriz2 {


    public static void main(String[] args) {
      Scanner solicitud = new Scanner (System.in);
        System.out.println("Digite el vlor de las filas");
        
        int filas = solicitud.nextInt();
        
        System.out.println("Digite le vlor de las columnas ");
        int columnas = solicitud.nextInt();
        
        int matriz[][] = new int [filas][columnas]; 
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length;j++){
                matriz[i][j] = generarNumAleatorios(0,10);
                System.out.print(matriz[i][j]+ " ");
        }
            System.out.println(" "); 
            
        }
        
        
        }
        
    public static int generarNumAleatorios(int minimo, int maximo){
            return (int)Math.floor(Math.random()*minimo-(maximo+1)+ (maximo +1));
    }
    
}
