package by.nasgor.patterns.creational.builder;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 4/30/14
 * Time: 11:30 AM
 */
public class Customer {
    public static void main(String[] args){
        Waiter waiter = new Waiter();
        StarbucksBuilder coffeeBuilder = new CoffeBuilder();

        waiter.setStarbucksBuilder(coffeeBuilder);
        waiter.constructStarbucks();

        Starbucks drink = waiter.getStarbucksDrink();
    }
}
