package p9;


/**
 * Write a description of class StackManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StackManager
{
    public static void main(String[] args){
        IStack<Integer> stack = new MyStack<Integer>();
        for(int i = 0;i<10;i++){
            stack.push(i);
        }
        while(true){
            Integer n = stack.pop();
            if(n == null){
                break;
            }
            System.out.print(n +" ");
        }
    }
}
