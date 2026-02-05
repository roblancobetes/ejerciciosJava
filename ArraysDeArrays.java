
import java.util.Arrays;

public class ArraysDeArrays {

    //Método principal
    public static void main(String[] args) {

        int[][] A = {
            {1, 2},
            {4, -5},
            {4, -5}
        };

        int[][] B = {
            {-1, 56},
            {4, -5}
        };

        int[][] C = sumarMatrices(A, B);

        //Mostrar matriz del resultado en pantalla
        for (int[] fila : C) {

            System.out.println(Arrays.toString(fila));
            
        }
    
    }

    //Método de Java para sumar matrices
    public static int[][] sumarMatrices(int[][] A, int[][] B) {

        if (A.length != B.length) {
            
            throw new IllegalArgumentException("El número de filas de las matrices no coinciden");

        }

        //Inicializar número de filas
        int n = A.length;

        for (int i = 0; i < n; i++) {

            if (A[i].length!=B[i].length) {

                throw new IllegalArgumentException("El número de columnas de las matrices no coinciden");

            }
            
        }

        //Inicializar demás valores
        int m = A[0].length;

        int[][] resultado = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                //Calcular suma elemento a elemento
                resultado[i][j] = A[i][j] + B[i][j];
            }
            
        }

        return resultado;
 
    }

}