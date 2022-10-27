package one;


import java.util.Arrays;

    public class ArreglosEnteros {
        public static void main(String[] args) {

            //Formas de declarar e inicializar arreglos
            //1 forma
            int[] numeros;
            numeros = new int[10];

            numeros[0] = 2;
            numeros[1] = 3;

            for(int i=0; i<numeros.length; i++)
            {
                numeros[i]=i+5;
            }

            //Mostrar el arreglo otros
            mostrar(numeros);


            //2 forma
            int[] otros = new int[20];
            otros[0] = 1;
            otros[1] = 2;

            //Llenar el arreglo otros
            for(int i=0; i<otros.length; i++)
            {
                otros[i]=i+11;
            }

            //otros = llenarArreglo(otros); ???

            //Mostrar el arreglo otros
            mostrar(otros);

            //3 forma
            int[] numeros_pares = new int[]{2,4,6,8,10};

            System.out.println(numeros_pares[0]);
            System.out.println(numeros_pares[1]);
            System.out.println(numeros_pares[2]);

            mostrar(numeros_pares);
        }

        public static void mostrar(int[] numeros)
        {
            System.out.println("----------------------");

            System.out.println(Arrays.toString(numeros));

            System.out.println(numeros.toString());
            System.out.println("++++++++++++++++++++++++");

            System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
            //Mostrar el arreglo otros
            for(int i=0; i<numeros.length; i++)
            {
                System.out.println(numeros[i]);
            }

            //return NO ES NECESARIO, PORQUE ES VOID
        }


    }
