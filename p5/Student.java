package p5;
import java.util.*;

/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    public String name;
    public String major;
    public int Student_id;
    public double grade;
    public Student(String a,String b,int c,double d){
        this.name = a;
        this.major = b;
        this.Student_id = c;
        this.grade = d;
    }
    public String toString(){
        return "이름:"+ this.name +
               "\n학과:"+ this.major +
               "\n학번:"+ this.Student_id +
               "\n학점평균:" +this.grade +"\n";
    }
    public String sec(Student i){
        return "이름:"+ this.name +
               "\t학과:"+ this.major +
               "\t학번:"+ this.Student_id +
               "\t학점평균:" +this.grade +"\n";
    }
    public String se(String i){
        return "이름:"+ this.name +
               "\t학과:"+ this.major +
               "\t학번:"+ this.Student_id +
               "\t학점평균:" +this.grade +"\n";
    }
}
