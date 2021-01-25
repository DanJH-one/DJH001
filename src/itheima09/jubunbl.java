package itheima09;

public class jubunbl {
    private int a=11;

    private void show(){
        class jbnbl{
            private int b=22;
            public void eat(){
                System.out.println("局部内部类");
                System.out.println(a);
            }
        }
        jbnbl jbnbl = new jbnbl();
        jbnbl.eat();
    }

    public void mast(){
        jubunbl jubunbl = new jubunbl();
        jubunbl.show();
    }

}
