import java.util.Scanner;

public class CalcularAreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del primer lado del triángulo: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Ingrese la longitud del segundo lado del triángulo: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Ingrese la longitud del tercer lado del triángulo: ");
        double lado3 = scanner.nextDouble();

        double area = calcularAreaTriangulo(lado1, lado2, lado3);

        System.out.println("El área del triángulo es: " + area);
    }

    public static double calcularAreaTriangulo(double lado1, double lado2, double lado3) {
        // Calculamos el semiperímetro del triángulo
        double semiperimetro = (lado1 + lado2 + lado3) / 2;

        // Aplicamos la fórmula de Herón para calcular el área

        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }
}
