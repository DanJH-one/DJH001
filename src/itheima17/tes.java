package itheima17;

import itheima12.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class tes {
    public static void main(String[] args) {
        student s1 = new student("刘亦菲", "21", "杭州");
        student s2 = new student("李易峰", "22", "苏州");
        student s3 = new student("六月份", "23", "北京");
        student s11 = new student("六月份", "23", "北京");
        student s311 = new student("六月份", "23", "北京");
        student s3111 = new student("六月份", "23", "北京");
        student s31111 = new student("六月份", "23", "北京");
        student s311111 = new student("六月份", "23", "北京");
        student s3111111 = new student("六月份", "23", "北京");
        student s31111111 = new student("六月份", "23", "北京");
        student s311111111 = new student("六月份", "23", "北京");
        student s3111111111 = new student("六月份", "23", "北京");
        student s31111111111 = new student("六月份", "23", "北京");
        student s2111111111 = new student("六月份", "23", "北京");
        student s211111111 = new student("六月份", "23", "北京");
        student s21111111 = new student("六月份", "23", "北京");
        student s2111111 = new student("六月份", "23", "北京");
        student s211111 = new student("六月份", "23", "北京");
        Collection<student> co=new ArrayList<>();
        co.add(s1);
        co.add(s2);
        co.add(s3);
        co.add(s11);
        co.add(s311);
        co.add(s3111);
        co.add(s31111);
        co.add(s311111);
        co.add(s3111111);
        Iterator<student> it = co.iterator();
        long l = System.currentTimeMillis();
        for (int i = 0; i < co.size(); i++) {
            if (it.hasNext()){
                student next = it.next();
                System.out.println(next.getXm()+"-"+next.getNl()+"-"+next.getDz());
            }
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l+"毫秒");
    }
}
