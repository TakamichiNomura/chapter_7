package p5;
import java.util.*;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stu_Array
{
    public static void main(String[] args){
        ArrayList<Student> al = new ArrayList<Student>();
        Scanner s = new Scanner(System.in);
        String array[] = new String[4];
        Student st = new Student("","",0,0.0);
        int i = 0;
        System.out.println("학생이름, 학과, 학번, 학점평균 입력하세오");
        for(;i<4;i++){
            System.out.print(">>");
            String name = s.next();
            array[i] = name;
            String major = s.next();
            int Student_id = s.nextInt();
            double grade = s.nextDouble();
            st = new Student(name,major,Student_id,grade);
            al.add(i,st);
        }
        for(i = 0;i<4;i++){
            System.out.println("______________________________");
            System.out.println(al.get(i));
        }
        while(true){
            System.out.print("학생 이름>>");
            String code = s.next();
            if(code.equals("그만"))
                System.exit(0);
            for(i = 0;i<4;i++){
                if(code.equals(array[i])){
                    System.out.println(st.sec(al.get(i)));
                }
            }
        }
    }
}   
