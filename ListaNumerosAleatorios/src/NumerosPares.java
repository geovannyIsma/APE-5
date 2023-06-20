import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumerosPares {
    public static void main(String[] args) {
        List<Integer> numeros = generarListaNumerosAleatorios(10, 1, 100);
        mostrarNumerosPares(numeros);
    }

    public static List<Integer> generarListaNumerosAleatorios(int cantidad, int minimo, int maximo) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(maximo - minimo + 1) + minimo;
            numeros.add(numero);
        }

        return numeros;
    }

    public static void mostrarNumerosPares(List<Integer> numeros) {
        System.out.println("Números pares:");

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
