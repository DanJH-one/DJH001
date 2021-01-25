package itheima12;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(19);
        stu.setName("林青霞");
        System.out.println(stu);
        Student stu2 = new Student();
        stu2.setName("林青霞");
        stu2.setAge(19);
       // System.out.println(stu==stu2);
        boolean eq = eq(stu, stu2);
        System.out.println(eq);
        //System.out.println(stu.equals(stu2));
       /* public boolean equals(Object obj) {
        //谁调用this,this就指谁,这里是stu.equals(stu2),
        //所以是stu调用this,所以this是stu
        //stu==stu2   ==比较的是地址值 所以还是返回false  要比较内容需要重新equals方法
                return (this == obj);
            }*/


        //public void println(Object x) {
        //        String s = String.valueOf(x);
        //        synchronized (this) {
        //            print(s);
        //            newLine();
        //        }
        //    }

       /* public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }*/

        //public String toString() {
        //        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //    }
    }

    public static boolean eq(Student stu,Student stu2) {
        //如果stu==stu2地址值相同直接返回true
        if (stu == stu2) return true;
        //如果stu2内容为空或者不在同一个类中直接返回false
        if (stu2 == null || stu.getClass() != stu2.getClass()) return false;
        //向下转型
        //Student student = (Student) o;
        //隐藏了this 其实就是this.age!=stu2.age 返回false
        if (stu.getAge() != stu2.getAge()) return false;
        //name.equals(student.name)因为名字是String类型的所以调用的是String中的equals方法相同返回true
        return stu.getName() != null ? stu.getName().equals(stu2.getName()) : stu2.getName() == null;
    }
}
