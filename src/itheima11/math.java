package itheima11;

public class math {
    public static void main(String[] args) {
        /*int a=-22;
        int aa=122;
        System.out.println(Math.max(a,aa));
        System.out.println(Math.abs(a));
        System.out.println(System.currentTimeMillis());*/
        //1611565149475
        //1611565163011
        long start =System.currentTimeMillis();
        for (int a=0;a<=10000;a++){
            System.out.println(a);
        }
        long end=System.currentTimeMillis();
        System.out.println("共耗时:"+(end-start)+"毫秒");
    }
}
