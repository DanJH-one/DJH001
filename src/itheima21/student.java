package itheima21;

public class student {
    private String xm;
    private Integer chinesePerformance;
    private Integer mathScores;

    @Override
    public String toString() {
        return "student{" +
                "xm='" + xm + '\'' +
                ", chinesePerformance=" + chinesePerformance +
                ", mathScores=" + mathScores +
                '}';
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public void setChinesePerformance(Integer chinesePerformance) {
        this.chinesePerformance = chinesePerformance;
    }

    public void setMathScores(Integer mathScores) {
        this.mathScores = mathScores;
    }

    public String getXm() {
        return xm;
    }

    public Integer getChinesePerformance() {
        return chinesePerformance;
    }

    public Integer getMathScores() {
        return mathScores;
    }

    public student() {
    }

    public student(String xm, Integer chinesePerformance, Integer mathScores) {
        this.xm = xm;
        this.chinesePerformance = chinesePerformance;
        this.mathScores = mathScores;
    }
}
