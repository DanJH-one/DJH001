package itheima17;

import itheima12.Test;
import itheima16.list;

import java.util.ArrayList;
import java.util.Collections;

public class demo {
    public static void main(String[] args) {
        ArrayList<String> li=new ArrayList<String>();
        li.add("hello");
        li.add("word");
        li.add("java");
        System.out.println(li);
        Collections.reverse(li);
        System.out.println(li);
    }
}
