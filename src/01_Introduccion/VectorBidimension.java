public class VectorBidimension {
	
	public static void main(String[] args) {
		// Matriz: se emplea para almacenar un grupo de datos del mismo
		// tipo de forma bidimensional basados en [x],[y]

		// Matrices recomendadas (inicializadas correctamente)
		int matrizNumero1[][] = new int[4][5]; // Matriz de 4 filas y 5 columnas
		int[][] matrizNumeros2 = new int[4][5]; // Matriz de 4 filas y 5 columnas
		int[][] matrizNumero3 = new int[4][5]; // Matriz de 4 filas y 5 columnas
		int matrizNumero4[][] = { { 1, 2 }, { 3, 4 } }; // Matriz 2x2
		int matrizNumero5[][] = new int[][] { { 6, 2 }, { 2, 7 } }; // Matriz 2x2

		// Mostrar matrices recomendadas
		System.out.println("Contenido de matrizNumero1:");
		for (int i = 0; i < matrizNumero1.length; i++) {
			for (int j = 0; j < matrizNumero1[i].length; j++) {
				System.out.print(matrizNumero1[i][j] + " ");
			}
			System.out.println(); 
		}

		System.out.println("Contenido de matrizNumeros2:");
		for (int i = 0; i < matrizNumeros2.length; i++) {
			for (int j = 0; j < matrizNumeros2[i].length; j++) {
				System.out.print(matrizNumeros2[i][j] + " ");
			}
			System.out.println(); 
		}

		System.out.println("Contenido de matrizNumero4:");
		for (int i = 0; i < matrizNumero4.length; i++) {
			for (int j = 0; j < matrizNumero4[i].length; j++) {
				System.out.print(matrizNumero4[i][j] + " ");
			}
			System.out.println(); 
		}

		System.out.println("Contenido de matrizNumero5:");
		for (int i = 0; i < matrizNumero5.length; i++) {
			for (int j = 0; j < matrizNumero5[i].length; j++) {
				System.out.print(matrizNumero5[i][j] + " ");
			}
			System.out.println(); 
		}

		// Matrices no recomendadas (no inicializadas adecuadamente)
		// Comentado para evitar errores de compilación
		// int matrizNumero6[][]; // Declaración sin inicialización
		// int matrizNumero7[][] = {}; // Declaración de una matriz vacía

		// Notas sobre matrices no recomendadas
		System.out.println("Recuerda que no se puede acceder a una matriz no inicializada,");
		System.out.println("y una matriz vacía no tiene filas ni columnas.");
	}
}
