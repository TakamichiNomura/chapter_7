package p5;
import java.util.*;

/**
 * Write a description of class hashmap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hashmap
{
    public static void main(String[] args){
        HashMap<String, String> h = new HashMap<String, String>();
        h.put("baby","아기");
        h.put("love","사랑");
        h.put("apple","사과");
        String kor1 = h.get("love");
        String kor3 = h.get("babo");
        System.out.println(kor1);
        System.out.println(kor3);
        h.remove("apple");
        int n = h.size();
        Set<String> keys = h.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = h.get(key);
            System.out.println("("+ key +","+ value +")");
        }
    }   
}
