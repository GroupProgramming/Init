package one;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;;

public class StringSort {
    public static void main(String[] args) {
        // Unsorted string array
        String[] strArray = { "Alex", "Zachary", "Dean", "Amanda", "Brian" };
        strArray = Stream.of(strArray)
                .sorted()
                .toArray(String[]::new);

        System.out.println(Arrays.toString(strArray));

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
    }

}
