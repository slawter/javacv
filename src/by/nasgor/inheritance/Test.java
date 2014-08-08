package by.nasgor.inheritance;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 8/7/14
 * Time: 4:12 PM
 */
public class Test {
    class A {
        String str = "ab";

        A() {
            printLength();
        }

        void printLength() {
            System.out.println(str.length());
        }
    }

    class B extends A {
        String str = "abc";

        void printLength() {
            System.out.println(str.length());
        }
    }

    public static void main(String[] args) {
        new Test().new B();
    }
}