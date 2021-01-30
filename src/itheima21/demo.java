package itheima21;

import java.util.Comparator;
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {
        //根据总分来排序
        TreeSet<student> set = new TreeSet<>(new Comparator<student>() {
            @Override
            public int compare(student s1, student s2) {
                //根据总分排序 比较器等于0时不会添加
                int num = (s2.getChinesePerformance() + s2.getMathScores()) - (s1.getChinesePerformance() + s1.getMathScores());
                //当总分相同时根据语文成绩来添加(因为对于0时会加不进去)
                int num1 = num == 0 ? s2.getMathScores() - s1.getMathScores() : num;
                //当语文成绩相同时还要根据名字来添加
                int num2 = num1 == 0 ? s2.getXm().compareTo(s1.getXm()) : num1;
                return num2;
            }
        });
        student s1 = new student("小红", 91, 92);
        student s2 = new student("小明", 92, 91);
        student s3 = new student("小绿", 93, 12);
        student s4 = new student("小蓝", 9, 12);
        student s5 = new student("小青", 9, 12);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        for (student s : set) {
            System.out.println(s);
        }

    }
}
