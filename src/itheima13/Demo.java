package itheima13;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr={12,22,32,14,56,1,3,2,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.toString(paixu(arr));
        System.out.println(Arrays.toString(paixu(arr)));

    }
    public static int[] paixu(int[] arr){
        int temp;
        for (int a = 0; a < arr.length-1; a++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        return arr;
    }
}
