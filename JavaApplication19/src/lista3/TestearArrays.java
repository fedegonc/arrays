
package lista3;

import java.util.Arrays;
import java.util.Scanner;
import static lista3.MeusArrays.buscar;
import static lista3.MeusArrays.generarArray;

public class TestearArrays {
    public static void main(String[] args) {
       System.out.println("Digite el tamaño de los arrays: ");

        int t = new Scanner(System.in).nextInt();

        System.out.println("Ingrese el numero a buscar: ");

        int z = new Scanner(System.in).nextInt();

        int[] x = new int[t];
        int[] y = new int[t];

        for (int i = 0; i < x.length; i++) {

            x[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < y.length; i++) {

            y[i] = (int) (Math.random() * 10);
        }
        System.out.print("\n\n");
        for (int g : x) {

            System.out.print(g + " ");
        }
        System.out.print("\n\n");
        for (int h : y) {

            System.out.print(h + " ");
        }
        System.out.print("\n\n");
        System.out.print(z + " ");
        System.out.print("\n\n");
        System.out.print("El valor fue encontrado en: "+buscar(x, y, z)+" arrays");
        System.out.print("\n\n");
        
       System.out.println("Ingrese un valor entero: ");

        int k = new Scanner(System.in).nextInt();
        System.out.print(Arrays.toString(generarArray(k))); 
        

    }
     
}
