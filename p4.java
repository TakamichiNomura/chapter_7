import java.util.*;
/**
 * Write a description of class p4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p4
{
    public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer>();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("강수량 입력(0 입력시 종료)>>");
            int sum = 0;
            int score = s.nextInt();
            v.add(score);
            if(score == 0){
                break;
            }
            for(int i = 0;i<v.size();i++){
                sum += v.get(i);
                System.out.print(v.get(i)+" ");
            }
            System.out.println();
            System.out.println("현재 평균 "+ sum/v.size());
        }
    }
}
