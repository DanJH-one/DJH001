package itheima02;

public class Demo {
    public static void main(String[] args) {
        aiDemo aiDemo = new aiDemo();
        cat cat = new cat();
        aiDemo.show(cat);

        dog dog = new dog();
        //aiDemo.show1(dog);
        aiDemo.show(dog);

        ainimo a=new dog();//向上转型
        a.chi();

        dog d=(dog) a;
        d.kan();
        d.chi();





      final   String s="kk";


    }
}
