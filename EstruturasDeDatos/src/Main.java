
public class Main {
    public static void main(String[] args) {

    //Lista Enlazada
        System.out.println("Lista Enlazada");
        var lista = new ListaEnlazada();

        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);

        lista.imprimir();
        lista.eliminar(2);
        lista.imprimir();
        lista.insertar(5, 2);
        lista.imprimir();

    //Lista Doblemente Enlazada

        System.out.println("Lista Doblemente Enlazada");
        var listaDoble = new ListaDoblementeEnlazada();

        listaDoble.agregar(1);
        listaDoble.agregar(2);
        listaDoble.agregar(3);
        listaDoble.agregar(4);

        listaDoble.imprimir();
        listaDoble.eliminar(2);
        listaDoble.imprimir();
        listaDoble.insertar(5, 2);
        listaDoble.imprimir();

    //Lista Circular
        System.out.println("Lista Circular");
        var listaCircular = new ListaCircular();

        listaCircular.agregar(1);
        listaCircular.agregar(2);
        listaCircular.agregar(3);
        listaCircular.agregar(4);

        listaCircular.imprimir();
        listaCircular.eliminar(2);
        listaCircular.imprimir();
        listaCircular.insertar(5, 2);
        listaCircular.imprimir();

    //Lista Doblemente Circular
        System.out.println("Lista Doblemente Circular");
        var listaDobleCircular = new ListaDoblementeCircular();

        listaDobleCircular.agregar(1);
        listaDobleCircular.agregar(2);
        listaDobleCircular.agregar(3);
        listaDobleCircular.agregar(4);

        listaDobleCircular.imprimir();
        listaDobleCircular.eliminar(2);
        listaDobleCircular.imprimir();
        listaDobleCircular.insertar(5, 2);
        listaDobleCircular.imprimir();

    }
}