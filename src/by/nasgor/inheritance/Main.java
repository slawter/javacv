package by.nasgor.inheritance;


public class Main implements Cloneable{

    public static String getClassName(){
        return "Main";
    }

    public Main() {
        System.out.println("Main constructor");
    }

    public static void main(String[] args) {
        Main b = new B();
        b.printVariable();
    }

    public final void printVariable(){
        System.out.println("variable is initialized in Main Class");
    }

    public Main clone() throws CloneNotSupportedException{
        return (Main)super.clone();
    }
}

