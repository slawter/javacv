package by.nasgor.inheritance;


public class Main {

    public Main() {
        System.out.println("Main constructor");
    }

    public static void main(String[] args) {
        Main b = new B();
        b.printVariable();
    }

    protected void printVariable(){
        System.out.println("variable is initialized in Main Class");
    }
}

