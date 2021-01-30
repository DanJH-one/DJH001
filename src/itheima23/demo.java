package itheima23;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        int a = 9;

        System.out.println(show(1, 2));
        System.out.println(show(1, 2, 3));
        System.out.println(show(1, 2, 3, 4));

        System.out.println(show(1, 2, 3, 4, 5));
        System.out.println(show(1, 2, 3, 4, 5, 6));
        System.out.println(show(1, 2, 3, 4, 5, 6, 7));


    }

    public static int show(int b,int... a) {
        int sum = 0;
        for (int s : a) {
            sum += s;
        }
        return sum;
    }

   /* public static int show(int a, int b) {
        return a + b;
    }

    public static int show(int a, int b, int c) {
        return a + b + c;
    }

    public static int show(int a, int b, int c, int d) {
        return a + b + c + d;
    }*/
}
