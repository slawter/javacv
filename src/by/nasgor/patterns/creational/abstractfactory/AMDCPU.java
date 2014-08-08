package by.nasgor.patterns.creational.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 4/30/14
 * Time: 10:40 AM
 */
public class AMDCPU implements CPU{
    public AMDCPU(){}

    @Override
    public void process() {
        System.out.println("AMD is processing..");
    }
}
