package one;


import java.util.*;

public class Factorial {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el numero del que desea ver el factorial: ");
        int num = teclado.nextInt();
        if(num < 0) {
            System.out.println("No se puede calcular factorial de un valor negativo.");
        } else {
            int resultado = Factorial(num);
            int resultadoCeros = Ceros(resultado);
            System.out.printf("El resultado es: %d\n", resultado,"y tiene ",resultadoCeros);
        }
    }

    public static int Factorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; ++i) {
            factorial *= i;
            if (factorial>=10000){
                System.out.println("valor fuera de los parametros:");
                break;
            }


        }
        return factorial;

    }
    public static int Ceros(int n) {
        int contador = 0;
        int value = n;

        while(value>=10){
            value /= 10;
            contador+=1;

        }
        return contador;
    }
}