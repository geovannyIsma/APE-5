import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numero = 0;

        try {
            numero = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("El valor ingresado no es un número entero.");
            main(args);
            System.exit(0);
        }

        if (esPar(numero)) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}