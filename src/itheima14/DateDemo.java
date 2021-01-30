package itheima14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args)throws Exception {

        String s="2021-12-1 11:11:12";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date parse = simpleDateFormat1.parse(s);
        System.out.println(parse);



        /*Date date = new Date();
        String format1 = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss").format(date);
        //System.out.println(format1 );
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String format = simpleDateFormat.format(date);
         System.out.println(format);
        date.setTime(1000*60*60);*/
        //System.out.println(date);
//        long l = System.currentTimeMillis();
//        System.out.println(date);
//        System.out.println(l);
//        long time = date.getTime();
//        System.out.println(time*1.0/1000/60/60/24/365);
//        Date date1 = new Date(1);
//        System.out.println(date1);
    }
}
