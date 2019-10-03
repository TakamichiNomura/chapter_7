import java.util.*;
/**
 * Write a description of class p7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p7
{
    public static void main(String[] args){
        var hp = new HashMap<String, Double>();
        Scanner s = new Scanner(System.in);
        System.out.println("미래장학금관리시스템입니다.");
        for(int i = 0;i<5;i++){
            System.out.print("이름과 학점>>");
            String name = s.next();
            double score = s.nextDouble();
            hp.put(name, score);
        }
        System.out.print("장학생 선발 학점 기준 입력>>");
        double num = s.nextDouble();
        Iterator<String> it = hp.keySet().iterator();
        System.out.print("장학생 명단:");
        String temp;
        while(it.hasNext()){
            temp = it.next();
            if(num <= hp.get(temp)){
                System.out.print(temp +" ");
            }
        }
        s.close();
    }
}
