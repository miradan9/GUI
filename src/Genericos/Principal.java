package Genericos;

public class Principal {
    public static void main(String[] args) {
        ClaseG<String> gen1 = new ClaseG<>("Hola");
        System.out.println(gen1.getDato());

        Persona p1 = new Persona("Diego",18,"M","Atlacomulco");
        ClaseG<Persona> gen2 = new ClaseG<>(p1);
        System.out.println(gen2.getDato());
        OrdenaGenerica <String> o=new OrdenaGenerica<>();
        String [] datos={"Valeria","Julio","Dafne"};
        o.setA(datos);
        System.out.println("El valor mayor es: "+o.getA());

        OrdenaGenerica<Integer> o2=new OrdenaGenerica<>();
        Integer[] datos2={1,8,3,4};
    }
}
