package one;

import java.util.Scanner;

public class Reverso {
    public static void main(String[] args) {

        String original, reverse = "";
        System.out.println("Ingrese el string para obtener su reverso");
        Scanner in = new Scanner(System.in);
        original = in.nextLine();
        int length = original.length();
        for(int i=length-1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println(reverse);
    }
}
