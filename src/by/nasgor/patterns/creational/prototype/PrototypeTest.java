package by.nasgor.patterns.creational.prototype;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 4/30/14
 * Time: 12:31 PM
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        A a = new A(1);

        for (int i = 2; i < 10; i ++){
            Prototype temp = a.clone();
            temp.setSize(i);
            temp.printSize();
        }
    }
}
