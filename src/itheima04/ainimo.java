package itheima04;

public abstract class ainimo {
    private String xm;
    private int nl;
    private String aihao;

    public ainimo(String xm, int nl, String aihao) {
        this.xm = xm;
        this.nl = nl;
        this.aihao = aihao;
    }

    //抽象方法
    public abstract void chi();

    public ainimo() {
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public void setNl(int nl) {
        this.nl = nl;
    }

    public void setAihao(String aihao) {
        this.aihao = aihao;
    }

    public String getXm() {
        return xm;
    }

    public int getNl() {
        return nl;
    }

    public String getAihao() {
        return aihao;
    }

    public void show(){
        System.out.println(xm+""+nl+""+aihao);
    }
}
