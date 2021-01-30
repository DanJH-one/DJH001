package itheima22;

//泛型类
public class student<T> {
private T t;

    public student() {
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public student(T t) {
        this.t = t;
    }
}
