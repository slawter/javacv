package by.nasgor.inheritance;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 8/4/14
 * Time: 3:07 PM
 */
public class B extends Main {
    public B() {
        System.out.println("B constructor");
    }

    protected void printVariable(){
        System.out.println("variable is initialized in B Class");
    }
}