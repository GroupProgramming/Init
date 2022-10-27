package one;

public class ContadorLetras{
    public static void main(String[] args){
        String palabra = "Mortimer";
        palabra = palabra.toLowerCase();

        for(int i=0; i<palabra.length(); i++)
        {
            char letra = palabra.charAt(i);
            if(!letra_repetida(palabra, letra, i))
            {
                int num_letras = contar_letras(palabra, letra);
                System.out.println(letra + " " + num_letras);
            }
        }
    }

    public static Boolean letra_repetida(String palabra, char letra, int pos)
    {
        Boolean repetida = false;
        if(pos == 0 || pos >= palabra.length())
        {
            return false;
        }

        for(int i=0; i<pos; i++)
        {
            if(palabra.charAt(i) == letra)
                repetida = true;
            //int a = i;
        }
        return repetida;
    }
    public static int contar_letras(String palabra, char letra)
    {
        int contador = 0;
        for(int i=0; i<palabra.length(); i++)
        {
            if(palabra.charAt(i) == letra)
            {
                contador++;
            }
        }
        return contador;
    }
}