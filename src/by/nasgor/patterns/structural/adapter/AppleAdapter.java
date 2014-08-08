package by.nasgor.patterns.structural.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 4/30/14
 * Time: 12:58 PM
 */
public class AppleAdapter {
    private Orange orange;
    public AppleAdapter (Orange orange){
        this.orange = orange;
    }
    public void getAColor(String str){
        orange.getOColor(str);
    }
}
