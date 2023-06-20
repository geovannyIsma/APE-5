public class ListaDoblementeEnlazada<T> implements Metodos{
    private NodoDoble<T> cabeza;


    @Override
    public void agregar(Object dato) {
        NodoDoble<T> nuevoNodo = (NodoDoble<T>) new NodoDoble<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoDoble<T> nodoActual = cabeza;
            while (nodoActual.getSiguiente() != null) {
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(nodoActual);
        }
    }

    @Override
    public void eliminar(int posicion) {
        if (posicion == 0) {
            if (cabeza != null) {
                cabeza = cabeza.getSiguiente();
                if (cabeza != null) {
                    cabeza.setAnterior(null);
                }
            }
        } else {
            NodoDoble<T> nodoAnterior = obtenerNodo(posicion - 1);
            NodoDoble<T> nodoEliminar = nodoAnterior.getSiguiente();
            NodoDoble<T> nodoSiguiente = nodoEliminar.getSiguiente();
            nodoAnterior.setSiguiente(nodoSiguiente);
            if (nodoSiguiente != null) {
                nodoSiguiente.setAnterior(nodoAnterior);
            }
        }
    }

    @Override
    public void imprimir() {
        NodoDoble<T> nodoActual = cabeza;
        while (nodoActual != null) {
            System.out.print(nodoActual.getValor() + " -> ");
            nodoActual = nodoActual.getSiguiente();
        }
        System.out.println();
    }

    @Override
    public void insertar(Object dato, int posicion) {
        NodoDoble<T> nuevoNodo = (NodoDoble<T>) new NodoDoble<>(dato);
        if (posicion == 0) {
            nuevoNodo.setSiguiente(cabeza);
            if (cabeza != null) {
                cabeza.setAnterior(nuevoNodo);
            }
            cabeza = nuevoNodo;
        } else {
            NodoDoble<T> nodoAnterior = obtenerNodo(posicion - 1);
            NodoDoble<T> nodoSiguiente = nodoAnterior.getSiguiente();
            nodoAnterior.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(nodoAnterior);
            nuevoNodo.setSiguiente(nodoSiguiente);
            if (nodoSiguiente != null) {
                nodoSiguiente.setAnterior(nuevoNodo);
            }
        }
    }

    private NodoDoble<T> obtenerNodo(int posicion) {
        NodoDoble<T> nodoActual = cabeza;
        for (int i = 0; i < posicion; i++) {
            nodoActual = nodoActual.getSiguiente();
        }
        return nodoActual;
    }


}
