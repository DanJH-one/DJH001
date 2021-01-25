package itheima09;

public class nimnbl {

    public void show(){
        inter i = new inter() {
            @Override
            public void eat() {
                System.out.println("匿名内部类");
            }
        };
        i.eat();
    }
}
