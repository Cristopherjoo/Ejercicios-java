import java.util.Scanner;

public class ParImparTernaria {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número es: " + resultado);
        
        sc.close();
    }
}
