package fundamentos;

public class PrioridadOperaciones {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;

        // Prioridad de operadores:
        // 1. Paréntesis () se resuelven primero.
        // 2. Multiplicación *, División / y Módulo % tienen la misma prioridad y se resuelven de izquierda a derecha.
        // 3. Suma + y Resta - tienen menor prioridad y también se resuelven de izquierda a derecha.

        int resultado1 = a + b * c;    // Multiplicación tiene prioridad: 10 + (5 * 2) = 20
        int resultado2 = (a + b) * c;  // Paréntesis tiene prioridad: (10 + 5) * 2 = 30
        int resultado3 = a + b - c * b; // Multiplicación se resuelve primero: 10 + 5 - (2 * 5) = 5

        System.out.println("Resultado 1 (a + b * c): " + resultado1);
        System.out.println("Resultado 2 ((a + b) * c): " + resultado2);
        System.out.println("Resultado 3 (a + b - c * b): " + resultado3);
    }
}
