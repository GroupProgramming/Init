package one;

import java.io.ObjectInputStream.GetField;

public class RiceBang {
    public static void main(String[] args) {

        int goal = 15;

        int result = getNumberSmallBags(3, 5, goal);

        System.out.println("# Bags:" + result);

    }

    public static Integer getNumberSmallBags(Integer big, Integer small, Integer goal)
    {
        int result = -1;
        if (big * 5 >= goal) {
            if (small >= goal % 5)
                result = goal % 5;
        } else {
            if (small >= goal - big * 5) {
                result = goal - big * 5;
            }
        }
        return result;
    }
}
