package itheima10;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jumpo = new JumppingOperator();
        //Jumpping ju=new Jumppingimp();
       // jumpo.method(ju);
        jumpo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        });

        jumpo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");
            }
        });
    }
}
