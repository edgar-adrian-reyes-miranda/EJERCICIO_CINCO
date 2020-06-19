package MATRIZ;

import java.util.Scanner;

public class MATRIZ_EJERCICIO {
  
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Ingresa un tamaño del arreglo i: ");
        int x = sc.nextInt();
        System.out.print("Ingresa un tamaño del arreglo j: ");
        int y = sc.nextInt();
        
        int array[] = new int[x];
        int arrey[] = new int[y];
        int combi[] = new int[x+y];
       
        for (int i=0; i<x; i++) {
               System.out.print(array[i]+i+ "   ");
        }
        
        System.out.println("");
        
        for (int j=1; j<y; j++) {
            System.out.print(arrey[j]+j+" "+""+" ");
            
            for (int i=1; i<x; i++) {
                combi[i] = (array[i]+i) * (arrey[j]+j);
                if(((array[i]+i) * (arrey[j]+j)) <10){
                System.out.print(combi[i]+" "+"  ");
                }
                else{
                System.out.print(combi[i]+" "+" ");
                }
            }
            System.out.println("");
        }
    }
    
}
