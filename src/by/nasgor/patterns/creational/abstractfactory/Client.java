package by.nasgor.patterns.creational.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 4/30/14
 * Time: 10:38 AM
 */
public class Client {
    public Client(){}

    public static CPUFactory createSpecificFactory(){
        int sys = 0;
        if (sys == 0)
            return new AMDFactory();
        else
            return new IntelFactory();
    }

    public static void main(String[] args){
        new Computer(createSpecificFactory());
    }
}
