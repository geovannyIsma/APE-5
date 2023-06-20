public class ListaCircular<T> implements Metodos{

    private Nodo<T> cabeza;

    @Override
    public void agregar(Object dato) {
        Nodo<T> nuevoNodo = new Nodo<>((T)dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.setSiguiente(cabeza);
        } else {
            Nodo<T> nodoActual = cabeza;
            while (nodoActual.getSiguiente() != cabeza) {
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(cabeza);
        }
    }

    @Override
    public void eliminar(int posicion) {
        if (posicion == 0) {
            if (cabeza != null) {
                Nodo<T> nodoActual = cabeza;
                while (nodoActual.getSiguiente() != cabeza) {
                    nodoActual = nodoActual.getSiguiente();
                }
                cabeza = cabeza.getSiguiente();
                nodoActual.setSiguiente(cabeza);
            }
        } else {
            Nodo<T> nodoAnterior = obtenerNodo(posicion - 1);
            Nodo<T> nodoEliminar = nodoAnterior.getSiguiente();
            Nodo<T> nodoSiguiente = nodoEliminar.getSiguiente();
            nodoAnterior.setSiguiente(nodoSiguiente);
        }
    }

    @Override
    public void imprimir() {
        if (cabeza != null) {
            Nodo<T> nodoActual = cabeza;
            do {
                System.out.print(nodoActual.getDato() + " ->");
                nodoActual = nodoActual.getSiguiente();
            } while (nodoActual != cabeza);
            System.out.println();
        }
    }

    @Override
    public void insertar(Object dato, int posicion) {
        Nodo<T> nuevoNodo = new Nodo<>((T)dato);
        if (posicion == 0) {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
        } else {
            Nodo<T> nodoAnterior = obtenerNodo(posicion - 1);
            Nodo<T> nodoSiguiente = nodoAnterior.getSiguiente();
            nodoAnterior.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(nodoSiguiente);
        }
    }
    private Nodo<T> obtenerNodo(int posicion) {
        Nodo<T> nodoActual = cabeza;
        for (int i = 0; i < posicion; i++) {
            nodoActual = nodoActual.getSiguiente();
        }
        return nodoActual;
    }
}
