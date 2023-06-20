import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    private List<Integer> numeros;
    public Lista() {
        numeros = new ArrayList<>();
    }
    public void ingresarNumeros() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los números de la lista (ingrese -1 para finalizar):");

        int numero;
        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero != -1) {
                numeros.add(numero);
            }
        } while (numero != -1);
    }

    public double calcularPromedio() {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        return (double) suma / numeros.size();
    }

    public void ordenarLista() {
        for (int i = 0; i < numeros.size(); i++) {
            for (int j = 0; j < numeros.size() - 1; j++) {
                if (numeros.get(j) > numeros.get(j + 1)) {
                    int aux = numeros.get(j);
                    numeros.set(j, numeros.get(j + 1));
                    numeros.set(j + 1, aux);
                }
            }
        }
    }

    //getters y setters
    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }
}