package itheima07;

public abstract class  renL {
    private String xm;
    private Integer nl;
    //定义一个吃饭的抽象方法
    public abstract void chi();

    public renL(String xm, Integer nl) {
        this.xm = xm;
        this.nl = nl;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public Integer getNl() {
        return nl;
    }

    public void setNl(Integer nl) {
        this.nl = nl;
    }

    public renL() {
    }
}
