package by.nasgor.patterns.creational.prototype;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 4/30/14
 * Time: 12:31 PM
 */
public class A implements Prototype, Cloneable{
    private int size;
    public A(int size){}
    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void printSize() {
        System.out.println(size);
    }

    public A clone() throws CloneNotSupportedException{
        return (A)super.clone();
    }
}
