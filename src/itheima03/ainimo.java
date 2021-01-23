package itheima03;

//抽象类
public abstract class ainimo {
    private int a=20;
    //抽象方法
    public abstract void chi();

    //非抽象方法
    public void show(){
        System.out.println(a);
    }

    //无参构造方法
    public ainimo(){

    }
    //带参构造方法
    public ainimo(int a){
        this.a=a;
    }
}
