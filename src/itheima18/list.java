package itheima18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class list {
    public static void main(String[] args) {
        List<String> li=new ArrayList<>();
        li.add("hello");
        li.add("word");
        li.add("java");
        //Iterator<String> iterator = li.iterator();
        /*while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equals("word")){
                li.add("l");
            }
        }*/
        /*for (int i = 0; i < li.size(); i++) {
            String s = li.get(i);
            if (s.equals("word")){
                li.add("l");
            }
        }*/
      /*  boolean word = li.contains("word");
        if (word==true){
            li.add("K");
        }*/
        /*ListIterator<String> stringListIterator = li.listIterator();
        while (stringListIterator.hasNext()){
            if (stringListIterator.next().equals("word")){
                stringListIterator.add("U");
            }
        }*/
        System.out.println(li);
    }
}
