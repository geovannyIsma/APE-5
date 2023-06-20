public class ListaEnlazada<T> implements Metodos{
    private Nodo inicio;

    public ListaEnlazada() {
        this.inicio = null;
    }

    private boolean isEmpty() {
        return this.inicio == null;
    }


    @Override
    public void eliminar(int posicion) {
        if (posicion >= 0) {
            if (posicion == 0) {
                this.inicio = this.inicio.getSiguiente();
            } else {
                Nodo aux = this.inicio;
                for (int i = 0; i < posicion - 1; i++) {
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
            }
        }
    }

    @Override
    public void agregar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (this.inicio == null) {
            this.inicio = nuevo;
        } else {
            Nodo aux = this.inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    @Override
    public void imprimir() {
        Nodo aux = this.inicio;
        while (aux != null) {
            System.out.print(aux.getDato() + " -> ");
            aux = aux.getSiguiente();
        }
        System.out.println(" ");
    }

    @Override
    public void insertar(Object dato, int posicion) {
        if (posicion >= 0) {
            Nodo nuevo = new Nodo(dato);
            if (posicion == 0) {
                nuevo.setSiguiente(this.inicio);
                this.inicio = nuevo;
            } else {
                Nodo aux = this.inicio;
                for (int i = 0; i < posicion - 1; i++) {
                    aux = aux.getSiguiente();
                }
                nuevo.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(nuevo);
            }
        }
    }

}
