package itheima13;

import java.util.Arrays;

public class tets {
    public static void main(String[] args) {
        int[] arr={1,3,88,99,0,91};
        System.out.println(arr);
        String s = Arrays.toString(arr);
        System.out.println(s);
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));
        /*static void	sort(int[] a)
         按照数字顺序排列指定的数组。

         static void	parallelSort(int[] a)
         按照数字顺序排列指定的数组。
        * */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
