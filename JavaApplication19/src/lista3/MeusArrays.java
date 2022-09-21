package lista3;


public class MeusArrays {

    public static int buscar(int[] array1, int[] array2, int numero) {
        int valor = 0;

        for (int x : array1) {
            if (x == numero) {
                valor++;
                break;
            }
            
        }

        for (int x : array2) {
            if (x == numero) {
                valor++;
                break;
            }
            
        }

        return valor;
    }

    
    public static int[] generarArray(int numero) {
        int[] array = new int[numero];
        
        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 1000);
        }
        
        return array;
    }
}
