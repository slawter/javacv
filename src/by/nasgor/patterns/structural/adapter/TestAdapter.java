package by.nasgor.patterns.structural.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 4/30/14
 * Time: 12:58 PM
 */
public class TestAdapter {
    public static void main(String[] args){
        Apple apple1 = new Apple();
        apple1.getAColor("green");

        Orange orange = new Orange();

        AppleAdapter aa = new AppleAdapter(orange);
        aa.getAColor("red");
    }
}
