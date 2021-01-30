package itheima15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class yic {
    public static void main(String[] args) {
        /*int[] arr = {1, 2, 3};
        System.out.println("开始");

        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("结束");*/
        System.out.println("开始");

        //show();
        try {
            et();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("结束");
    }

    public static void et() throws ParseException {
        String s="1994-11-11";
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        Date parse = format.parse(s);
        System.out.println(parse);
    }

    public static void show() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}

