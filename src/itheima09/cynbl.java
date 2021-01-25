package itheima09;

public class cynbl {
    private int nun=12;

    private class show{
        private int b=22;
        public void eat(){
            System.out.println("成员内部类");
            System.out.println(nun);
        }
    }

    public void show2(){
        show show = new show();
        show.eat();
    }
}
