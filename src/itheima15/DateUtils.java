package itheima15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    //工具类用 private修饰 私有 无法从外部创建对象
    private DateUtils() {
    }

//把date转为string用format方法
    public static String ds(String s,Date da){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(s);
        String format = simpleDateFormat.format(da);
        return format;
    }
    //把String转为date用方法
    public static Date sd(String s,String da)throws Exception{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(s);
        Date parse = simpleDateFormat.parse(da);
        return parse;
    }
}

