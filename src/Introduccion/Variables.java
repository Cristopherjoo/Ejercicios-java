public class Variables {
	public static void main(String[] args) {
		// Constantes
		final int MAX_EDAD = 150; // Máxima edad permitida
		final double PI = 3.14159; // Valor de PI

		// Tipos primitivos
		// byte: almacena valores entre -128 y 127
		byte edadPositiva = 127;
		byte edadNegativa = -128;

		// short: almacena valores entre -32,768 y 32,767
		short temperaturaPositiva = 30;
		short temperaturaNegativa = -15;

		// int: almacena valores entre -2,147,483,648 y 2,147,483,647
		int poblacionPositiva = 100000;
		int poblacionNegativa = -50000;

		// long: almacena valores entre -9,223,372,036,854,775,808 y
		// 9,223,372,036,854,775,807
		long distanciaPositiva = 15000000000L;
		long distanciaNegativa = -15000000000L;

		// float: almacena valores aproximadamente de -3.4E38 a 3.4E38
		float pesoPositivo = 65.5f;
		float pesoNegativo = -75.0f;

		// double: almacena valores aproximadamente de -1.7E308 a 1.7E308
		double alturaPositiva = 1.75;
		double alturaNegativa = -2.0;

		// char: almacena un único carácter, valores de '\u0000' a '\uFFFF'
		char inicialC = 'C'; // Usando el carácter 'C'
		char inicialR = '\u0052'; // Usando el valor Unicode para 'R'

		// boolean: almacena un valor verdadero o falso
		boolean esEstudiante = true;
		boolean noEsEstudiante = false;

		// Imprimir los valores
		System.out.println("Constantes:");
		System.out.println("MAX_EDAD: " + MAX_EDAD);
		System.out.println("PI: " + PI);
		System.out.println("\nTipos Primitivos:");
		System.out.println("byte: " + edadPositiva + ", " + edadNegativa);
		System.out.println("short: " + temperaturaPositiva + ", " + temperaturaNegativa);
		System.out.println("int: " + poblacionPositiva + ", " + poblacionNegativa);
		System.out.println("long: " + distanciaPositiva + ", " + distanciaNegativa);
		System.out.println("float: " + pesoPositivo + ", " + pesoNegativo);
		System.out.println("double: " + alturaPositiva + ", " + alturaNegativa);
		System.out.println("char: " + inicialC + ", " + inicialR);
		System.out.println("boolean: " + esEstudiante + ", " + noEsEstudiante);
		System.out.println("\nFin del Programa\n");
	}
}
