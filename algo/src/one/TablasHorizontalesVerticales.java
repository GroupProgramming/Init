package one;

import java.util.Arrays;

public class TablasHorizontalesVerticales {

    public static void main(String[] args) {

        char[][] estructuraMuro; // Inicializa matriz de caracteres de mxn


        estructuraMuro = new char[6][5];

        char[] primeraFila = new char[5];
        primeraFila[0] = 'a';
        primeraFila[1] = 'b';
        primeraFila[2] = 'c';
        primeraFila[3] = 'd';
        primeraFila[4] = 'e';

        estructuraMuro[0] = primeraFila;

        //------
        char[] segundaFila = new char[5];
        segundaFila[0] = 'f';
        segundaFila[1] = 'g';
        segundaFila[2] = 'h';
        segundaFila[3] = 'i';
        segundaFila[4] = 'j';

        estructuraMuro[1] = segundaFila;

        estructuraMuro[2] = primeraFila;
        estructuraMuro[3] = primeraFila;
        estructuraMuro[4] = segundaFila;
        estructuraMuro[5] = primeraFila;

        //------------
        /*
        for(int i=0; i<estructuraMuro.length; i++)
            System.out.println(Arrays.toString(estructuraMuro[i]));
        */
        //-------------------------

        char[][] estructuraMuro2 = new char[][]{
                new char[]{'a','a','a','b','b'},
                new char[]{'a','a','b','b','b'},
                new char[]{'b','a','a','a','a'},
                new char[]{'p','q','r','s','t'},
                new char[]{'-','-','|','|','-'},
                new char[]{'-','-','|','|','|'}
        };

        /*
        System.out.println("-----------------------------");
        for(int i=0; i<estructuraMuro2.length; i++)
            System.out.println(Arrays.toString(estructuraMuro2[i]));
        */
        System.out.println("-----------------------------");
        for(int i=0; i<estructuraMuro2.length; i++)
        {
            for(int j=0; j<estructuraMuro2[i].length; j++)
            {
                System.out.print(estructuraMuro2[i][j]+" ");
            }

            System.out.print("\n");
        }

        System.out.println("-----------------------------");

        //El nro de filas de una matriz se obtiene mediante el primer length a la matriz.
        int nroFilas = estructuraMuro2.length;

        //Para conocer el nro de columnas de una matriz, basta con obtener el nro de columnas
        //de cualquiera de las filas, en este caso, se obtiene el tamano de la columna en 0
        int nroColumnas = estructuraMuro2[0].length;

        //Para leer en forma inversa, se recorren las
        for(int i = 0; i<nroColumnas; i++)
        {
            for(int j = 0; j < nroFilas; j++){
                System.out.print(estructuraMuro2[j][i]+" ");
            }

            System.out.print("\n");
        }
    }

}
