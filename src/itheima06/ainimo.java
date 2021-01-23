package itheima06;

public abstract class ainimo implements jinen{
    private String xm;
    private String nl;

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public ainimo() {
    }

    public ainimo(String xm, String nl) {
        this.xm = xm;
        this.nl = nl;
    }

    public abstract void xxi();

}
