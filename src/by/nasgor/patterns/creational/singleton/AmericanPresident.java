package by.nasgor.patterns.creational.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 4/28/14
 * Time: 4:03 PM
 */
public class AmericanPresident {
    private AmericanPresident(){}

    private static AmericanPresident thePresident;

    public static AmericanPresident getThePresident(){
        if (thePresident == null)
            thePresident = new AmericanPresident();

        return thePresident;
    }
}
