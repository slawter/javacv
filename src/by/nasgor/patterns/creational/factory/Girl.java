package by.nasgor.patterns.creational.factory;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 4/28/14
 * Time: 4:11 PM
 */
public class Girl implements Human{
    @Override
    public void Talk() {
        System.out.println("Girl is talking..");
    }

    @Override
    public void Walk() {
        System.out.println("Girl is walking..");
    }
}
