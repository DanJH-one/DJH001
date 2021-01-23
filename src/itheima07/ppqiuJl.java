package itheima07;

public class ppqiuJl extends jiaoLing{
    public ppqiuJl() {
    }

    public ppqiuJl(String xm, Integer nl) {
        super(xm, nl);
    }

    @Override
    public void jiao() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void chi() {
        System.out.println("乒乓球教练爱吃肯德基");
    }
}
