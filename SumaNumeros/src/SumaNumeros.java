import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0, numero2 = 0;

        try {
            System.out.print("Ingrese el primer número: ");
             numero1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            numero2 = scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Error: El valor ingresado no es un número entero , vuelva a ingresar un numero.");
            main(args);
            System.exit(0);
        }

        int suma = numero1 + numero2;
        System.out.println("La suma de los dos números es: " + suma);
    }
}