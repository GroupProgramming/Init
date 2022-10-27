package one;

public class Cadenas {
    public static void main(String[] args) {

        String nombre = "Juan";
        String apellido = "Vargas";
        int edad = 20;

        String nombreCompleto = nombre + " " + apellido;

        System.out.println(nombreCompleto);
        System.out.println(nombre + " " + apellido);

        System.out.println("-------------------");

        System.out.println("a" + "b" + 5);
        System.out.println(nombreCompleto + ". Edad: " +5+ " years.");

        System.out.println("-------------------");

        int a = 1;
        int b = 2;
        String nombreCombinado = nombreCompleto + a + b;
        System.out.println("Pablo" + 1 + 2);
        System.out.println("Pablo" + a + b);
        System.out.println(nombreCombinado);

        System.out.println(a + b + "Pablo");

        System.out.println("-------------------");

        System.out.println(nombreCombinado==nombre);

        System.out.println("-------------------");
        System.out.println(nombreCombinado.equals(nombre));

    }
}
