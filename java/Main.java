import java.util.Scanner;
                    double nota;

                    do {
                        System.out.print("Nota (0-10): ");
                        nota = sc.nextDouble();
                    } while (nota < 0 || nota > 10);

                    sc.nextLine();

                    arbol.insertarEstudiante(new Estudiante(cedula, nombre, nota));
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