package itheima16;

import java.util.ArrayList;
import java.util.Collection;

public class collection {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList();
        coll.add("sss");
        coll.add("bbb");
        coll.add("aaa");
        System.out.println(coll);
        coll.remove("bbb");//从集合中移除指定的元素
        System.out.println(coll);
        //coll.clear();
        System.out.println(coll);
        System.out.println(coll.size());
        boolean empty = coll.isEmpty();
        System.out.println(empty);
        boolean aaa = coll.contains("aaa");
        System.out.println(aaa);
    }
}
