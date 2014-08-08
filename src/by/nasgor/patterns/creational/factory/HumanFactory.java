package by.nasgor.patterns.creational.factory;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 4/28/14
 * Time: 4:11 PM
 */
public class HumanFactory {
    public static void main(String[] args){
        Human boy = createHuman("boy");
        boy.Talk();
    }
    public static Human createHuman(String m){
        Human human = null;
        if (m.equalsIgnoreCase("boy")){
            human = new Boy();
        }else if (m.equalsIgnoreCase("girl")){
            human = new Girl();
        }
        return human;
    }
}
