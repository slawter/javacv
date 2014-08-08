package by.nasgor.testtask;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 8/5/14
 * Time: 3:09 PM
 */
public class DeleteString {

    public  void filter(List<String> list, String toDelete){
        for(ListIterator li = list.listIterator(); li.hasNext();){
            if (li.next().equals(toDelete))
                li.remove();
        }
    }

    public static void main(String[] args){
        double begin = System.currentTimeMillis();
        List<String> list = new ArrayList<String>();

        list.add("sdfsdf");
        list.add("dfghgy");
        list.add("hjhj");
        list.add("hjhj");
        list.add("hjhj");
        list.add("hjhj");

        DeleteString ds = new DeleteString();
        ds.filter(list, "hjhj");
        for (String s:list)
            System.out.println(s);
        double end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
