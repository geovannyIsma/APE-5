public class Main {
    public static void main(String[] args) {
        Lista calculadora = new Lista();
        calculadora.ingresarNumeros();

        double promedio = calculadora.calcularPromedio();

        System.out.println("El promedio de los números ingresados es: " + promedio);

        calculadora.ordenarLista();

        System.out.println("La lista ordenada es: " + calculadora.getNumeros());
    }
}
