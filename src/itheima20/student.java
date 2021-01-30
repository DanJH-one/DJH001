package itheima20;

public class student implements Comparable<student> {
    private String xm;
    private Integer nl;
    private String dz;

    public student() {
    }

    public student(String xm, Integer nl, String dz) {
        this.xm = xm;
        this.nl = nl;
        this.dz = dz;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public void setNl(Integer nl) {
        this.nl = nl;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public String getXm() {
        return xm;
    }

    public Integer getNl() {
        return nl;
    }

    public String getDz() {
        return dz;
    }

    @Override
    public String toString() {
        return "student{" +
                "xm='" + xm + '\'' +
                ", nl=" + nl +
                ", dz='" + dz + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        student student = (student) o;

        if (xm != null ? !xm.equals(student.xm) : student.xm != null) return false;
        if (nl != null ? !nl.equals(student.nl) : student.nl != null) return false;
        return dz != null ? dz.equals(student.dz) : student.dz == null;
    }

    @Override
    public int hashCode() {
        int result = xm != null ? xm.hashCode() : 0;
        result = 31 * result + (nl != null ? nl.hashCode() : 0);
        result = 31 * result + (dz != null ? dz.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(student s) {
        int num = this.nl - s.nl;
        int num1 = num == 0 ? this.xm.compareTo(s.xm) : num;
        return num1;
    }
}
