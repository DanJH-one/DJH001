package itheima16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class list {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        long time = new Date().getTime();
        System.out.println(l);
        System.out.println(time);
        Collection<String> co=new ArrayList();
        co.add("hello");
        co.add("word");
        co.add("java");
        System.out.println(co);
        //得到迭代器对象
        Iterator<String> iterator = co.iterator();
        for (int i = 0; i < co.size(); i++) {
            //如果还有元素hasNext()
            if (iterator.hasNext()){
                //就得到这个元素
                System.out.println(iterator.next());
            }
        }

       ArrayList<student> st=new ArrayList<>();
        st.add(new student("李易峰","22"));
        st.add(new student("李易","2"));
        for (int i = 0; i < st.size(); i++) {
            student student = st.get(i);
            System.out.println(student.getXm()+"-"+student.getNl());
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1);
        System.out.println(l1-l);
    }
}
