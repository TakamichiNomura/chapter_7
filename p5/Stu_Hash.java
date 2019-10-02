package p5;
import java.util.*;

/**
 * Write a description of class Hash here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stu_Hash
{
    public static void main(String[] args){
        var hp = new HashMap<String, Student>();
        Scanner s = new Scanner(System.in);
        Student st = new Student("a","a",0,0);
        String array[] = new String[4];
        System.out.println("학생 이름,학과,학번,학점평균 입력하세오");
        int i = 0;
        for(;i<4;i++){
            System.out.print(">>");
            String name = s.next();
            array[i] = name;
            String major = s.next();
            int grade = s.nextInt();
            double score = s.nextDouble();
            st = new Student(name,major,grade,score);
            hp.put("i",st);
        }
        for(i = 0;i<4;i++){
            System.out.println("_____________________________");
            System.out.println(hp.get("i"));
        }
        Set<String> keys = hp.keySet();
        Iterator<String> it = keys.iterator();
        while(true){
            System.out.print("학생 이름>>");
            String name = s.next();
            if(name.equals("그만"))
                break;
            for(i = 0;i<4;i++){
                if(name.equals(array[i])){
                    System.out.println(hp.get("i"));
                }
            }
        }
    }
}
