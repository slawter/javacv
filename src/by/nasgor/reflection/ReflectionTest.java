package by.nasgor.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 8/8/14
 * Time: 2:47 PM
 */
public class ReflectionTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        MyClass myClass = new MyClass();
        Class c = myClass.getClass();
        Field publicFields = c.getDeclaredField("a");
        publicFields.setAccessible(true);
        publicFields.set(myClass, 25);
        System.out.println(publicFields.get(myClass));
    }
}
