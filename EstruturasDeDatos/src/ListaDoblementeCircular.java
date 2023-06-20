public class ListaDoblementeCircular<T> implements Metodos{
    private NodoDoble<T> cabeza;

    @Override
    public void agregar(Object dato) {
        NodoDoble<T> nuevoNodo = (NodoDoble<T>) new NodoDoble<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.setSiguiente(cabeza);
            cabeza.setAnterior(cabeza);
        } else {
            NodoDoble<T> nodoActual = cabeza;
            while (nodoActual.getSiguiente() != cabeza) {
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(nodoActual);
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevoNodo);
        }
    }

    @Override
    public void eliminar(int posicion) {
        if (posicion == 0) {
            if (cabeza != null) {
                NodoDoble<T> nodoAnterior = cabeza.getAnterior();
                NodoDoble<T> nodoSiguiente = cabeza.getSiguiente();
                nodoAnterior.setSiguiente(nodoSiguiente);
                nodoSiguiente.setAnterior(nodoAnterior);
                cabeza = cabeza.getSiguiente();
            }
        } else {
            NodoDoble<T> nodoAnterior = obtenerNodo(posicion - 1);
            NodoDoble<T> nodoEliminar = nodoAnterior.getSiguiente();
            NodoDoble<T> nodoSiguiente = nodoEliminar.getSiguiente();
            nodoAnterior.setSiguiente(nodoSiguiente);
            nodoSiguiente.setAnterior(nodoAnterior);
        }
    }

    @Override
    public void imprimir() {
        if (cabeza != null) {
            NodoDoble<T> nodoActual = cabeza;
            do {
                System.out.print(nodoActual.getValor() + " ->");
                nodoActual = nodoActual.getSiguiente();
            } while (nodoActual != cabeza);
            System.out.println();
        }
    }

    @Override
    public void insertar(Object dato, int posicion) {
        NodoDoble<T> nuevoNodo = (NodoDoble<T>) new NodoDoble<>(dato);
        if (posicion == 0) {
            nuevoNodo.setSiguiente(cabeza);
            nuevoNodo.setAnterior(cabeza.getAnterior());
            cabeza.getAnterior().setSiguiente(nuevoNodo);
            cabeza.setAnterior(nuevoNodo);
            cabeza = nuevoNodo;
        } else {
            NodoDoble<T> nodoAnterior = obtenerNodo(posicion - 1);
            NodoDoble<T> nodoSiguiente = nodoAnterior.getSiguiente();
            nodoAnterior.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(nodoAnterior);
            nuevoNodo.setSiguiente(nodoSiguiente);
            nodoSiguiente.setAnterior(nuevoNodo);
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
