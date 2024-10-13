import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Condicionales simples
        byte edad = 17;

        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
        
        // Condicionales múltiples
        if (edad >= 40 && edad < 60) {
            System.out.println("La persona es un adulto");
        } else if (edad < 40 && edad >= 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }

        // Ejercicio 3: Verificar la edad del usuario
        System.out.print("Introduce tu edad: ");
        int edadUsuario = sc.nextInt();
        if (edadUsuario >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        // Ejercicio 4: Calcular descuento
        System.out.print("Introduce el precio del producto: ");
        double precio = sc.nextDouble();
        if (precio > 100) {
            double descuento = precio * 0.10;
            double precioFinal = precio - descuento;
            System.out.println("El precio final con descuento es: " + precioFinal);
        } else {
            System.out.println("No hay descuento. El precio es: " + precio);
        }

        // Ejercicio 5: Determinar si un número es par o impar
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        sc.close();
    }
}
