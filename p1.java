import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p1
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        var v = new Vector<Integer>();
        System.out.print("정수(-1이 입력될 때까지)>>");
        int num = 0,count = 0,max = 0;
        while(true){
            num = s.nextInt();
            v.add(num);
            count ++;
            if(num == -1){
                for(int i = 0;i<count;i++){
                    if(max < v.get(i)){
                        max = v.elementAt(i);
                    }
                }
                System.out.println(max);
                break;
            }
        }
    }
}
