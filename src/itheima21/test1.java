package itheima21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test1 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(11);
        c.add(11);
        c.add(11);
        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
