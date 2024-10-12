package fundamentos;

// Matriz: se emplea para almacenar un grupo de datos del mismo
// tipo de forma bidimensional basados en [x],[y]

public class VectorBidimension {
    // Matrices recomendadas (inicializadas correctamente)
    int matrizNumero1[][] = new int[4][5]; 
    int [][]matrizNumeros2 = new int[4][5]; 
    int[][] matrizNumero3 = new int[4][5]; 
    int matrizNumero4[][] = {{1, 2}, {3, 4}}; 
    int matrizNumero5[][] = new int[][]{{6, 2}, {2, 7}}; 

    // Matrices no recomendadas (no inicializadas adecuadamente)
    // Intentar acceder a matrizNumero6 causará NullPointerException
    int matrizNumero6[][]; // Declaración sin inicialización

    // Matriz vacía, sin filas ni columnas; intentar acceder a
    // cualquier índice causará ArrayIndexOutOfBoundsException    
    int matrizNumero7[][] = {}; // Declaración de una matriz vacía
}


