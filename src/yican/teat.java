package yican;

public class teat {

    public static void show(int a) throws ex {
        if (a<0||100<a){
            throw new ex("有误");
        }else {
            System.out.println("正确");
        }
    }
}
