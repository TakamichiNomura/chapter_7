import java.util.*;
/**
 * Write a description of class p2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p2
{
    public static void main(String[] args){
        var al = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        String grade[] = {"A","B","C","D","F"};
        String subject = "";
        int i = 0;
        double score = 0;
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for(;i<6;i++){
            al.add(s.next());
        }
        for(i = 0;i<6;i++){
            subject = al.get(i);
            switch(subject){
                case "A":
                score = score + 4.0;
                break;
                case "B":
                score = score + 3.0;
                break;
                case "C":
                score = score + 2.0;
                break;
                case "D":
                score = score + 1.0;
                break;
                case "F":
                score = score + 0;
            }
        }
        System.out.println(score / 6);
    }
}
