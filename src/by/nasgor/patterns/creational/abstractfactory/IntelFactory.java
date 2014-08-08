package by.nasgor.patterns.creational.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 4/30/14
 * Time: 10:40 AM
 */
public class IntelFactory implements CPUFactory{
    public IntelFactory(){}

    @Override
    public CPU produceCPU() {
        return new IntelCPU();
    }
}
