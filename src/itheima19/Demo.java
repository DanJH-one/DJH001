package itheima19;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        List<student> li=new ArrayList<>();
        li.add(new student("张柏芝",12,"杭州"));
        li.add(new student("谢霆锋",13,"北京"));
        li.add(new student("小鱼儿",15,"苏州"));
        //第一种用List迭代器遍历
        /*ListIterator<student> stu = li.listIterator();
        while (stu.hasNext()){
            student next = stu.next();
            System.out.println(next.getXm()+"-"+next.getNl()+"-"+next.getDz());
        }*/

        //第二种用增强for遍历
       /* for (student next:li){
            System.out.println(next.getXm()+"-"+next.getNl()+"-"+next.getDz());
        }*/
        //第三种for遍历
        for (int i = 0; i < li.size(); i++) {
            student next = li.get(i);
            System.out.println(next.getXm()+"-"+next.getNl()+"-"+next.getDz());
        }
    }
}
