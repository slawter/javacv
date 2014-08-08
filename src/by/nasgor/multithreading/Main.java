package by.nasgor.multithreading;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 3/31/14
 * Time: 6:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    private static Thread r1;
    private static Thread r2;
    private static int i = 0;
    public static void main(String[] args){
        r1 = new Thread() {
            public void run() {
                while (i < 100){
                    if (i % 10 == 0) {
                        if (r2.isAlive())
                            r2.notify();
                        else
                            r2.run();
                    }
                    i++;
                }
                r1.interrupt();
                r2.interrupt();
            }
        };
        r2 = new Thread() {
            public void run() {
                System.out.println(i);
                try {
                    if (r2.isAlive()){
                        r2.wait();
                        r1.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        r1.run();
    }
}
