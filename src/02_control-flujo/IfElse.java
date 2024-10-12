public class IfElse {
	public static void main(String[] args) {
		// Condicionales simples
		byte edad = 17;

		if (edad >= 18) {
			System.out.println("La persona es mayor de edad");
		} else {
			System.out.println("La persona es menor de edad");
		}
		
		
		//Condicionales multiples
		if (edad >=40 && edad <60) {
			System.out.println("La persona es un adulto");
		}else if(edad <40 &&edad>=18){
			System.out.println("la Persona es mayor de edad");
		}else {
			System.out.println({"La persona es menor de edad");
		}
	}
}