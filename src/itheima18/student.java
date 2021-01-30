package itheima18;

import com.sun.org.apache.xpath.internal.objects.XString;

public class student {
    private String xm;
    private String nl;
    private String dz;

    public String getXm() {
        return xm;
    }

    public String getNl() {
        return nl;
    }

    public String getDz() {
        return dz;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public student(String xm, String nl, String dz) {
        this.xm = xm;
        this.nl = nl;
        this.dz = dz;
    }
}
