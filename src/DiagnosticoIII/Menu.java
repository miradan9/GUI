package DiagnosticoIII;
import java.util.ArrayList;
import java.util.Scanner;
import static java.util.Collections.sort;
public class Menu {
    private static ArrayList<String> listaComputadoras = new ArrayList<>();
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        String compu;
        do {
            menu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Dame la marca de la computadora: ");
                    compu = entrada.next();
                    agregarCompu(compu);
                    break;
                case 2:
                    sort(listaComputadoras);
                    mostrarListaComputadoras();
                    break;
                case 3:
                    sort(listaComputadoras);
                    mostrarListaComputadoras();
                    System.out.print("Dame la marca de la computadora a borrar");
                    compu = entrada.next();

                    listaComputadoras.remove(compu);
                    System.out.println("Dispositivo borrado");
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No válido");
                    break;
            } // Fin de switch
        } while (opcion != 4);
    }

    private static void menu() {
        System.out.println("--------------------------------");
        System.out.println("1.- Agregar marca de la computadora a la lista");
        System.out.println("2.- Mostrar computadoras");
        System.out.println("3.- Borrar computadora");
        System.out.println("4.- Salir");
        System.out.print("Elige una opcion: ");
    }

    private static void agregarCompu(String nombreComputadora) {
        listaComputadoras.add(nombreComputadora);
    }

    private static void mostrarListaComputadoras() {
        System.out.println("Lista de Computadoras: ");
        for (String computadora : listaComputadoras) {
            System.out.print(computadora + " ");
        }
        System.out.println();
    }

    private static int buscarComputadora(String nombreComputadora){
        for (int index = 0; index < listaComputadoras.size(); index++){
            if (nombreComputadora.equals(listaComputadoras.get(index))){
                return index;
            }
        }
        return -1;
    }
}

