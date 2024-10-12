public class FormateadoresTabla {
	public static void main(String[] args) {
		// Encabezados de la tabla
		System.out.printf("%-15s %-40s %-30s%n", "Especificador", "Descripción", "Ejemplo");
		System.out
				.println("------------------------------------------------------------------------------------------");

		// Filas de la tabla con ejemplos
		System.out.printf("%-15s %-40s %-30s%n", "%d", "Entero decimal", String.format("%d", 42));
		System.out.printf("%-15s %-40s %-30s%n", "%f", "Número de punto flotante", String.format("%f", 19.99));
		System.out.printf("%-15s %-40s %-30s%n", "%.2f", "Número de punto flotante (2 decimales)",
				String.format("%.2f", 19.999));
		System.out.printf("%-15s %-40s %-30s%n", "%s", "Cadena de texto", String.format("%s", "Cristopher"));
		System.out.printf("%-15s %-40s %-30s%n", "%c", "Carácter", String.format("%c", 'A'));
		System.out.printf("%-15s %-40s %-30s%n", "%b", "Valor booleano", String.format("%b", true));
		System.out.printf("%-15s %-40s %-30s%n", "%n", "Nueva línea", "Esta es una nueva línea" + "\n");
		System.out.printf("%-15s %-40s %-30s%n", "%10s", "Cadena con ancho mínimo de 10 (derecha)",
				String.format("%10s", "Texto"));
		System.out.printf("%-15s %-40s %-30s%n", "%-10s", "Cadena con ancho mínimo de 10 (izquierda)",
				String.format("%-10s", "Texto"));
		System.out.printf("%-15s %-40s %-30s%n", "%10.2f", "Punto flotante con ancho de 10 y 2 decimales",
				String.format("%10.2f", 19.99));

		// Encabezados de la tabla
		// %-20s: Alinea a la izquierda una cadena de texto en un campo de 20 caracteres
		// $%14.2f: Muestra un número de punto flotante (precio) alineado a la derecha
		// en un campo de 14 caracteres, con 2 decimales
		// %10d: Alinea a la derecha un número entero (cantidad) en un campo de 10
		// caracteres
		System.out.printf("%-20s %-15s %-10s%n", "Producto", "Precio", "Cantidad");
		System.out.println("-----------------------------------------------");

		// Datos de ejemplo
		// Imprime la información de cada producto usando el formateador
		System.out.printf("%-20s $%14.2f %10d%n", "Manzana", 0.99, 150); // Manzana
		System.out.printf("%-20s $%14.2f %10d%n", "Banana", 0.59, 200); // Banana
		System.out.printf("%-20s $%14.2f %10d%n", "Cereza", 2.99, 75); // Cereza
		System.out.printf("%-20s $%14.2f %10d%n", "Durazno", 1.49, 120); // Durazno
		System.out.printf("%-20s $%14.2f %10d%n", "Uva", 3.99, 60); // Uva
		System.out.printf("%-20s $%14.2f %10d%n", "Kiwi", 1.99, 90); // Kiwi

		System.out.println(); // Línea en blanco para separar

		// Encabezados para la sección de bebidas
		System.out.printf("%-20s %-15s %-10s%n", "Bebida", "Precio", "Cantidad");
		System.out.println("-----------------------------------------------");

		// Imprime la información de cada bebida
		System.out.printf("%-20s $%14.2f %10d%n", "Coca-Cola", 1.49, 100); // Coca-Cola
		System.out.printf("%-20s $%14.2f %10d%n", "Agua", 0.89, 250); // Agua
		System.out.printf("%-20s $%14.2f %10d%n", "Jugo", 2.49, 80); // Jugo

	}
}

