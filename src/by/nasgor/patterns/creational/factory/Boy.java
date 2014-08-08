package by.nasgor.patterns.creational.factory;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 4/28/14
 * Time: 4:11 PM
 */
public class Boy implements Human{
    @Override
    public void Talk() {
        System.out.println("Boy is talking..");
    }

    @Override
    public void Walk() {
        System.out.println("Boy is walking..");
    }
}
