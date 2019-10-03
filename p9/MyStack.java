package p9;
import java.util.*;

/**
 * Write a description of class MyStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyStack<T> implements IStack<Integer> 
{
    Vector<Integer> v = new Vector<Integer>();
    int i = 10;
    public Integer pop(){
        i --;
        if(i < 0){
            System.exit(0);
        }
        return v.get(i);
    }
    public boolean push(Integer ob){
        return v.add(ob);
    }
}
