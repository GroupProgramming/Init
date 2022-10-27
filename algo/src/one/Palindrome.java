package one;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original, reverse = "";
        System.out.println("Ingrese el string para verificar si es Palíndrome");
        Scanner in = new Scanner(System.in);
        original = in.nextLine();

        if(checkPalindromeString(original))
        {
            System.out.println("Es palindrome");
        }
        else
            System.out.println("No es palindrome");
    }

    static boolean checkPalindromeString(String input) {
        boolean result = true;
        int length = input.length();
        for(int i=0; i < length/2; i++) {
            if(input.charAt(i) != input.charAt(length-i-1)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
