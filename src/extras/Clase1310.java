package extras;

public class Clase1310 {
    private static String mensaje="Hola";
    private static int numero(int v1){
        return v1++;
    }
    public static void main(String[] args) {
        Clase1310.mensaje="mundo";

        System.out.println(Clase1310.mensaje);
        System.out.println("El resultado es "+Clase1310.numero(6));
    }
}
