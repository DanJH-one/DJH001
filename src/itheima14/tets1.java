package itheima14;

import java.util.Arrays;

public class tets1 {
    public static void main(String[] args) {
        String s="91 27 46 38 50";
        String[] s2 = s.split(" ");
        int length = s2.length;
        int[] a=new int[length];
        for (int i = 0; i < s2.length; i++) {
            int i1 = Integer.parseInt(s2[i]);
            a[i]=i1;
        }
        Arrays.sort(a);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (i==a.length-1) {
                stringBuilder.append(a[i]);
            }else {
                stringBuilder.append(a[i]+" ");
            }

        }
        String s1 = stringBuilder.toString();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            System.out.print(c);
        }

    }
}
