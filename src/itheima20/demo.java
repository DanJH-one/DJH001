package itheima20;

import java.util.Comparator;
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {
        //比较器排序接口Comparator
        //Comparable是一个接口
        //CompreTo()自然排序方法
       /* TreeSet<student> set = new TreeSet<>(new Comparator<student>() {
            @Override
            public int compare(student s1, student s2) {
              int num=s1.getNl()-s2.getNl();
              int num1=num==0?s1.getXm().compareTo(s2.getXm()):num;
                return num1;
            }
        });*/
        TreeSet<student> set = new TreeSet<>();
        student student = new student("abc",22,"杭州");
        student student1 = new student("bcd", 11, "北京");
        student student2 = new student("def", 23, "苏州");
        student student3 = new student("a", 23, "深圳");
        set.add(student);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        for (student s:set){
            System.out.println(s);
        }
        /*TreeSet<String> set = new TreeSet<>();
        String s1 = new String("kkk");
        String s2 = new String("kk");
        set.add(s1);
        set.add(s2);
        //set.add("helo");
        for (String s:set){
            System.out.println(s);
        }*/
    }
}
