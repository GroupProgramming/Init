package one;

import java.util.Scanner;

public class Comercial {
    public static void main(String[] args) {

        //Lector de teclado
        Scanner in = new Scanner(System.in);

        //Productos 5
        String[] productos = new String[]{"Aceite 2L","Coca Cola 2.5L","Harina 1Kg","Mantequilla 200Gr.","Leche 1L"};
        //Agencias 4
        String[] agencias = new String[]{"La Cancha", "Norte", "Sur", "Quillacollo"};

        //Matriz de Cantidades por Agencia-Producto
        int[][] cantidades = new int[4][5];
        int[][] precios = new int[4][5];


        System.out.println("Comercial Inf-Elec");
        System.out.println("---------------------");
        System.out.println("Ingrese los datos de las ventas por Agencia.");
        System.out.println("---------------------");

        for(int agencia= 0; agencia<4; agencia++)
        {
            System.out.println("Introducir datos para la Agencia: "+ agencias[agencia]);
            System.out.println("+++++++++++++++++++");

            for(int producto = 0; producto<5; producto++)
            {
                System.out.println("Ingrese las ventas para el Producto: " + productos[producto]);
                System.out.println("Cantidad:");
                cantidades[agencia][producto] = in.nextInt();

                System.out.println("Precio de venta unitario:");
                precios[agencia][producto] = in.nextInt();

                System.out.println("+++++++++++++++++++");
            }
        }

        //Reportes
        System.out.println("+++++++++++++++++++");
        System.out.println("REPORTES");
        System.out.println("+++++++++++++++++++");
        //Generar Reporte de Cantidades Totales de Cada Producto
        int[] totalesPorProducto = new int[5]; //{23,30,....} Alternativa
        int totalProd1 = 0;
        int totalProd2 = 0;
        int totalProd3 = 0;
        int totalProd4 = 0;
        int totalProd5 = 0;

        for(int agencia=0; agencia<4; agencia++)
        {
            totalProd1 = totalProd1 + cantidades[agencia][0];
            totalesPorProducto[0] =  totalesPorProducto[0] + cantidades[agencia][0];//Otra alternativa de sumar totales


            totalProd2 = totalProd2 + cantidades[agencia][1];
            totalProd3 = totalProd3 + cantidades[agencia][2];
            totalProd4 = totalProd4 + cantidades[agencia][3];
            totalProd5 = totalProd5 + cantidades[agencia][4];
        }

        System.out.println("Cantidades por Producto");
        System.out.println(productos[0] + ": " + totalProd1);
        System.out.println(productos[1] + ": " + totalProd2);
        System.out.println(productos[2] + ": " + totalProd3);
        System.out.println(productos[3] + ": " + totalProd4);
        System.out.println(productos[4] + ": " + totalProd5);

        //4.	Por cada Agencia, mostrar el total vendido de todos los productos. (En Bs.)
        int[] totalVendidoPorAgencia = new int[4];

        for(int agencia = 0; agencia<4; agencia++)
        {
            for(int producto = 0; producto < 5; producto++)
            {
                totalVendidoPorAgencia[agencia] = totalVendidoPorAgencia[agencia] + cantidades[agencia][producto]*precios[agencia][producto];
            }
        }

        System.out.println("+++++++++++++++++++");
        System.out.println("Ventas Totales por Agencia");

        for(int agencia = 0; agencia<4; agencia++)
            System.out.println("Agencia: "+ agencias[agencia]+", Total: "+ totalVendidoPorAgencia[agencia]);



    }
}
