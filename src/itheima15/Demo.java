package itheima15;

import java.util.Calendar;
import java.util.Date;

public class Demo {
    public static void main(String[] args)throws Exception{
        Calendar instance = Calendar.getInstance();
        instance.get(Calendar.AM_PM);
        String ds = DateUtils.ds("yyyy年MM月dd日", new Date());
        System.out.println(ds);
        Date dd = DateUtils.sd("yyyy年MM月dd日", "1994年04月22日");
        System.out.println(dd);
    }
}
