package by.nasgor.logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 8/6/14
 * Time: 1:03 PM
 */
public class TestLogger extends Exception{
    private static Logger logger = Logger.getLogger("LoggingException");


    public TestLogger(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args){
        try{
            throw new TestLogger();
        }catch (TestLogger ex){
            System.err.println("перехвачено");
        }
    }
}
