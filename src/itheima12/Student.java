package itheima12;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
/*
    @Override
    public boolean equals(Object o) {
        //如果stu==stu2地址值相同直接返回true
        if (this == o) return true;
        //如果stu2内容为空或者不在同一个类中直接返回false
        if (o == null || getClass() != o.getClass()) return false;
        //向下转型
        Student student = (Student) o;
        //隐藏了this 其实就是this.age!=stu2.age 返回false
        if (age != student.age) return false;
        //name.equals(student.name)因为名字是String类型的所以调用的是String中的equals方法相同返回true
        return name != null ? name.equals(student.name) : student.name == null;
    }*/
}
