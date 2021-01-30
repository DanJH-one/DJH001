package itheima18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<student> li=new ArrayList<>();
        li.add(new student("李易峰","12","杭州"));
        li.add(new student("李易","1","杭"));
       /* for (int i = 0; i < li.size(); i++) {
            student student = li.get(i);
            System.out.println(student.getXm());
        }*/
        Iterator<student> iterator = li.iterator();
        while (iterator.hasNext()){
            student next = iterator.next();
            System.out.println(next.getXm());
        }
    }
}
