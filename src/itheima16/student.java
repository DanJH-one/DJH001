package itheima16;

public class student {
    private String xm;
    private String nl;

    public student(String xm, String nl) {
        this.xm = xm;
        this.nl = nl;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public String getXm() {
        return xm;
    }

    public String getNl() {
        return nl;
    }

    @Override
    public String toString() {
        return "student{" +
                "xm='" + xm + '\'' +
                ", nl='" + nl + '\'' +
                '}';
    }
}
