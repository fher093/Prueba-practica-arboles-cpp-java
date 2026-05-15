import java.util.LinkedList;
            return buscar(nodo.izquierda, cedula);

        return buscar(nodo.derecha, cedula);
    }

    public void recorridoInorden() {
        inorden(raiz);
    }

    private void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierda);
            mostrar(nodo);
            inorden(nodo.derecha);
        }
    }

    public void recorridoPreorden() {
        preorden(raiz);
    }

    private void preorden(Nodo nodo) {
        if (nodo != null) {
            mostrar(nodo);
            preorden(nodo.izquierda);
            preorden(nodo.derecha);
        }
    }

    public void recorridoPostorden() {
        postorden(raiz);
    }

    private void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.izquierda);
            postorden(nodo.derecha);
            mostrar(nodo);
        }
    }

    public void recorridoPorNiveles() {
        if (raiz == null)
            return;

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            mostrar(actual);

            if (actual.izquierda != null)
                cola.add(actual.izquierda);

            if (actual.derecha != null)
                cola.add(actual.derecha);
        }
    }
   public void contarNodos() {
            menor = menorNota(nodo.izquierda, menor);
            menor = menorNota(nodo.derecha, menor);
        }

        return menor;
    }

    public void mostrarAprobados() {
        aprobados(raiz);
    }

    private void aprobados(Nodo nodo) {
        if (nodo != null) {
            aprobados(nodo.izquierda);

            if (nodo.dato.nota >= 7)
                mostrar(nodo);

            aprobados(nodo.derecha);
        }
    }

    public void mostrarReprobados() {
        reprobados(raiz);
    }

    private void reprobados(Nodo nodo) {
        if (nodo != null) {
            reprobados(nodo.izquierda);

            if (nodo.dato.nota < 7)
                mostrar(nodo);

            reprobados(nodo.derecha);
        }
    }

    public void eliminarEstudiante(String cedula) {
        raiz = eliminar(raiz, cedula);
    }

    private Nodo eliminar(Nodo nodo, String cedula) {
        if (nodo == null)
            return null;

        if (cedula.compareTo(nodo.dato.cedula) < 0)
            nodo.izquierda = eliminar(nodo.izquierda, cedula);

        else if (cedula.compareTo(nodo.dato.cedula) > 0)
            nodo.derecha = eliminar(nodo.derecha, cedula);

        else {
            if (nodo.izquierda == null)
                return nodo.derecha;

            if (nodo.derecha == null)
                return nodo.izquierda;

            Nodo sucesor = minimo(nodo.derecha);
            nodo.dato = sucesor.dato;
            nodo.derecha = eliminar(nodo.derecha, sucesor.dato.cedula);
        }

        return nodo;
    } 
       private Nodo minimo(Nodo nodo) {
        while (nodo.izquierda != null)
            nodo = nodo.izquierda;

        return nodo;
    }

    private void mostrar(Nodo nodo) {
        System.out.println(
                "Cedula: " + nodo.dato.cedula +
                " | Nombre: " + nodo.dato.nombre +
                " | Nota: " + nodo.dato.nota
        );
    }
}
