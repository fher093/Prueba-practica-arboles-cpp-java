import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArbolBST arbol = new ArbolBST();

        int opcion;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Insertar");
            System.out.println("2. Buscar");
            System.out.println("3. Eliminar");
            System.out.println("4. Inorden");
            System.out.println("5. Preorden");
            System.out.println("6. Postorden");
            System.out.println("7. Por niveles");
            System.out.println("8. Contar nodos");
            System.out.println("9. Altura");
            System.out.println("10. Nota mayor");
            System.out.println("11. Nota menor");
            System.out.println("12. Aprobados");
            System.out.println("13. Reprobados");
            System.out.println("14. Salir");

            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Cedula: ");
                    String cedula = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    double nota;

                    do {

                        System.out.print("Nota (0-10): ");
                        nota = sc.nextDouble();

                    } while (nota < 0 || nota > 10);

                    sc.nextLine();

                    arbol.insertarEstudiante(
                            new Estudiante(cedula, nombre, nota)
                    );

                    break;

                case 2:

                    System.out.print("Cedula: ");
                    arbol.buscarEstudiante(sc.nextLine());

                    break;

                case 3:

                    System.out.print("Cedula a eliminar: ");
                    arbol.eliminarEstudiante(sc.nextLine());

                    break;

                case 4:
                    arbol.recorridoInorden();
                    break;

                case 5:
                    arbol.recorridoPreorden();
                    break;

                case 6:
                    arbol.recorridoPostorden();
                    break;

                case 7:
                    arbol.recorridoPorNiveles();
                    break;

                case 8:
                    arbol.contarNodos();
                    break;

                case 9:
                    arbol.calcularAltura();
                    break;

                case 10:
                    arbol.buscarNotaMayor();
                    break;

                case 11:
                    arbol.buscarNotaMenor();
                    break;

                case 12:
                    arbol.mostrarAprobados();
                    break;

                case 13:
                    arbol.mostrarReprobados();
                    break;

                case 14:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 14);

        sc.close();
    }
}