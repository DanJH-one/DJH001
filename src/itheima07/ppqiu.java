package itheima07;

public class ppqiu extends yundYuan implements sprxu{

    public ppqiu() {
    }

    public ppqiu(String xm, Integer nl) {
        super(xm, nl);
    }

    @Override
    public void xxi() {
        System.out.println("乒乓球运动员学习乒乓球");
    }

    @Override
    public void chi() {
        System.out.println("乒乓球运动员吃薯条");
    }

    @Override
    public void shuo() {
        System.out.println("乒乓球运动员会说英语");
    }
}
