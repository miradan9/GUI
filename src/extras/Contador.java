package extras;

public class Contador {
    public static void main(String[] args) {
        int[] lista=new int[100];// Lista de números enteros que supondremos
        int contador=0; //Declaramos e inicializamos el contañor.
        for (int i=0; i<100;i++)
            if(lista[i]>17)
                contador++; //Incrementamos el contador si corresponde

        //Al finalizar el programa, el contador nos indica cuantas veces ha ocurrido algo
        System.out.println("Hay "+contador+" numeros mayores que 17.");
    }
}
