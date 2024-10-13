
public class VectorUnidimension {
    // Vector Arreglo: Se emplea para almacenar
    // un grupo de datos del mismo tipo.

    public static void main(String[] args) {
        // Vectores recomendados (inicializados correctamente)
        int vectorNumero1[] = new int[10]; // vector de 10 elementos
        int[] vectorNumero2 = new int[10]; // vector de 10 elementos

        int vectorNumero3[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }; // vector con valores
        int vectorNumero4[] = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }; // Inicialización explícita de un vector

        // Mostrar los vectores recomendados
        System.out.println("Contenido de vectorNumero1:");
        for (int i = 0; i < vectorNumero1.length; i++) {
            System.out.print(vectorNumero1[i] + " ");
        }
        System.out.println(); // Salto de línea

        System.out.println("Contenido de vectorNumero2:");
        for (int i = 0; i < vectorNumero2.length; i++) {
            System.out.print(vectorNumero2[i] + " ");
        }
        System.out.println(); // Salto de línea

        System.out.println("Contenido de vectorNumero3:");
        for (int num : vectorNumero3) {
            System.out.print(num + " ");
        }
        System.out.println(); // Salto de línea

        System.out.println("Contenido de vectorNumero4:");
        for (int num : vectorNumero4) {
            System.out.print(num + " ");
        }
        System.out.println(); // Salto de línea

        // Vectores no recomendados (errores en la inicialización)
        // Comentado para evitar errores de compilación
        // int[] vectorNUmero5 = new int[]; // ERROR: No se puede declarar un vector sin tamaño
        // int vectorNumero6[]; // Declaración sin inicialización
        // int vectorNumero7[] = {}; // Vector vacío

        // Notas sobre vectores no recomendados
        System.out.println("Recuerda que no se puede declarar un vector sin tamaño,");
        System.out.println("y un vector vacío no tiene elementos.");
    }
}
