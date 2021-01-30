package itheima17;


import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("word");
        list.add("java");
        System.out.println(list);
        list.add(1,"X");
        System.out.println(list);
        list.set(1,"Y");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println("kk");

    }
}
