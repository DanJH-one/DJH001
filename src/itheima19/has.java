package itheima19;

import java.util.HashSet;
import java.util.Set;

public class has {
    public static void main(String[] args) {
        String a = "hello";
        String aa = "word";
        String qa = "java";
        System.out.println(a.hashCode());
        System.out.println(a.hashCode());
        System.out.println(a.hashCode());
        System.out.println("---------------");
        System.out.println(aa.hashCode());
        System.out.println(qa.hashCode());
        /*String s="通话";
        System.out.println(s.hashCode());*/
        /*String ss="你好";
        System.out.println(ss.hashCode());*/
        System.out.println("--------------");
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());

        student student = new student();
        student.setXm("林青霞");
        student.setNl(11);
        student student1 = new student();
        student1.setXm("林青霞");
        student1.setNl(11);
        Set<student> set = new HashSet<>();
        set.add(student);
        set.add(student1);
        for (student s:set){
            System.out.println(s);
        }
    }
}
