import java.util.LinkedList;
import java.util.Queue;

public class ArbolBST {

    private Nodo raiz;

    public void insertarEstudiante(Estudiante e) {
        raiz = insertar(raiz, e);
    }

    private Nodo insertar(Nodo nodo, Estudiante e) {

        if (nodo == null)
            return new Nodo(e);

        if (e.cedula.compareTo(nodo.dato.cedula) < 0)
            nodo.izquierda = insertar(nodo.izquierda, e);

        else
            nodo.derecha = insertar(nodo.derecha, e);

        return nodo;
    }

    // ================= BUSCAR =================

    public void buscarEstudiante(String cedula) {

        Nodo encontrado = buscar(raiz, cedula);

        if (encontrado != null)
            mostrar(encontrado);
        else
            System.out.println("Estudiante no encontrado");
    }

    private Nodo buscar(Nodo nodo, String cedula) {

        if (nodo == null)
            return null;

        if (cedula.equals(nodo.dato.cedula))
            return nodo;

        if (cedula.compareTo(nodo.dato.cedula) < 0)
            return buscar(nodo.izquierda, cedula);

        return buscar(nodo.derecha, cedula);
    }

    // ================= RECORRIDOS =================

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

    // ================= CONTAR NODOS =================

    public void contarNodos() {
        System.out.println("Total nodos: " + contar(raiz));
    }

    private int contar(Nodo nodo) {

        if (nodo == null)
            return 0;

        return 1 + contar(nodo.izquierda) + contar(nodo.derecha);
    }

    // ================= ALTURA =================

    public void calcularAltura() {
        System.out.println("Altura: " + altura(raiz));
    }

    private int altura(Nodo nodo) {

        if (nodo == null)
            return 0;

        int izq = altura(nodo.izquierda);
        int der = altura(nodo.derecha);

        return 1 + Math.max(izq, der);
    }

    // ================= NOTA MAYOR =================

    public void buscarNotaMayor() {

        Estudiante mayor = mayorNota(raiz, raiz.dato);

        System.out.println("Mayor nota:");
        System.out.println(mayor.nombre + " -> " + mayor.nota);
    }

    private Estudiante mayorNota(Nodo nodo, Estudiante mayor) {

        if (nodo != null) {

            if (nodo.dato.nota > mayor.nota)
                mayor = nodo.dato;

            mayor = mayorNota(nodo.izquierda, mayor);
            mayor = mayorNota(nodo.derecha, mayor);
        }

        return mayor;
    }

    // ================= NOTA MENOR =================

    public void buscarNotaMenor() {

        Estudiante menor = menorNota(raiz, raiz.dato);

        System.out.println("Menor nota:");
        System.out.println(menor.nombre + " -> " + menor.nota);
    }

    private Estudiante menorNota(Nodo nodo, Estudiante menor) {

        if (nodo != null) {

            if (nodo.dato.nota < menor.nota)
                menor = nodo.dato;

            menor = menorNota(nodo.izquierda, menor);
            menor = menorNota(nodo.derecha, menor);
        }

        return menor;
    }

    // ================= APROBADOS =================

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

    // ================= REPROBADOS =================

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

    // ================= ELIMINAR =================

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

    // ================= MOSTRAR =================

    private void mostrar(Nodo nodo) {

        System.out.println(
                "Cedula: " + nodo.dato.cedula +
                " | Nombre: " + nodo.dato.nombre +
                " | Nota: " + nodo.dato.nota
        );
    }
}