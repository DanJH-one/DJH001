package itheima19;

import java.util.ArrayList;
import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        //arraylistd底层是数组 查询快 增删慢
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");

        //linked底层是链表 查询慢 增删快
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("java");

    }
}
