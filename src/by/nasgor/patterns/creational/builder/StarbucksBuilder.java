package by.nasgor.patterns.creational.builder;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 4/30/14
 * Time: 11:29 AM
 */
public abstract class StarbucksBuilder {
    protected Starbucks starbucks;

    public Starbucks getStarbucks(){
        return starbucks;
    }

    public void createStarbucks(){
        starbucks = new Starbucks();
        System.out.println("a drink is created");
    }

    public abstract void buildSize();
    public abstract void buildDrink();
}
