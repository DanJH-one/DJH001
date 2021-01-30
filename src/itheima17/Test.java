package itheima17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + " ");
        }
        Test test = new Test();
        //test.print(list);
        //反转
        test.reverseList1(list);
        System.out.println(list);

        test.reverseList2(list);
        System.out.println(list);

        //test.print(list);
    }

    public void reverseList1(List<String> list) {
        Collections.reverse(list);
    }

    public void reverseList2(List<String> list) {
        List<String> tmpList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            tmpList.add(list.get(i));
        }
        list.clear();
       list.addAll(tmpList);
    }

    public void print(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print((list.get(i)));
        }
        System.out.println();
    }
}

