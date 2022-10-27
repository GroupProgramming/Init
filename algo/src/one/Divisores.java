package one;

public class Divisores {
    public static void main(String[] args) {
        int numero = 2345;
        int copia = numero;
        int divisor=0;
        int cuantos =0;

        while(copia>0)
        {
            divisor = copia%10;
            if(numero%divisor==0)
            {
                cuantos++;
            }
            copia = copia/10;

            System.out.println(copia);
        }

    }
}
