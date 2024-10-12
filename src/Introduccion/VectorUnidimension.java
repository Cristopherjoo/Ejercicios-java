
public class VectorUnidimension {
// Vector Arreglo: Se emplea para almacenar
// un grupo de datos del mismo tipo.

	public static void main(String[] args) {
		// Vectores recomendados (inicializados correctamente)
		int vectorNumero1[] = new int[10]; // vector de 10 elementos
		int[] vectorNumero2 = new int[10]; // vector de 10 elementos

		int vectorNumero3[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }; // vector con valores
		int vectorNumero4[] = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }; // Inicialización explícita de un vector

		// Vectores no recomendados (errores en la inicialización)
		// ERROR: No se puede declarar un vector sin tamaño
		int[] vectorNUmero5 = new int[];

		// Declaración sin inicialización,
		// puede causar NullPointerException si se accede
		int vectorNumero6[];

		// Declara un vector vacío, no tiene elementos
		// Intentar acceder a cualquier índice causará ArrayIndexOutOfBoundsException
		int vectorNumero7[] = {};
	}
}
