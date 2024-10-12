public class Caracteres {
	public static void main(String[] args) {
		System.out.println("Usando caracteres especiales\n");

		char nuevaLinea = '\n'; // Nueva línea
		char tabulacion = '\t'; // Tabulación

		// Ejemplo de salida usando nueva línea y tabulación
		System.out.print("Nombre:" + tabulacion + "Cristopher" + nuevaLinea);
		System.out.print("País:" + tabulacion + "Chile");

		// Caracteres individuales
		char letraZ = 'Z'; // Letra
		char simboloPorcentaje = '%'; // Símbolo
		char numero3 = '3'; // Número
		char espacio = ' '; // Espacio
		char ampersand = '&'; // Ampersand
		char interrogacion = '?'; // Signo de interrogación
		char guionBajo = '_'; // Guion bajo
		char asterisco = '*'; // Asterisco

		// Mostrar todos los caracteres
		System.out.println("\n\nLetra: " + letraZ);
		System.out.println("Símbolo Porcentaje: " + simboloPorcentaje);
		System.out.println("Número: " + numero3);
		System.out.println("Espacio: '" + espacio + "'");
		System.out.println("Ampersand: " + ampersand);
		System.out.println("Signo de Interrogación: " + interrogacion);
		System.out.println("Guion Bajo: " + guionBajo);
		System.out.println("Asterisco: " + asterisco);

	}
}
