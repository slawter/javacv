package by.nasgor.patterns.creational.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 4/30/14
 * Time: 10:40 AM
 */
public class IntelCPU implements CPU {
    public IntelCPU(){}

    @Override
    public void process() {
        System.out.println("Intel is processing..");
    }
}
