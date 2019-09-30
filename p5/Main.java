package p5;
import java.util.*;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        ArrayList<Student> al = new ArrayList<Student>();
        Scanner s = new Scanner(System.in);
        Student st;
        int i = 0;
        System.out.println("학생이름, 학과, 학번, 학점평균 입력하세오");
        for(;i<4;i++){
            System.out.print(">>");
            st = new Student(s.next(),s.next(),s.nextInt(),s.nextDouble());
            al.add(i,st);
        }
        while(){
            System.out.println("______________________________");
            System.out.println(al.remove(i));
            
        }
    }
}   
