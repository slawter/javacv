package by.nasgor.patterns.creational.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 4/30/14
 * Time: 10:38 AM
 */
public class Computer {
    private CPU cpu;
    public Computer(CPUFactory factory){
        cpu = factory.produceCPU();
        cpu.process();
    }
}
