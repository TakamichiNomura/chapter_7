import java.util.*;
/**
 * Write a description of class p3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p3
{
    public static void main(String[] args){
        HashMap<String, Integer> nations = new HashMap<String, Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("나라 이름과 인구를 입력하세요.(예:korea 5000)");
        String name = "";
        int population;
        while(true){
            System.out.print("나라,이름,인구>>");
            name = s.next();
            if(name.equals("그만")){
                break;
            }
            population = s.nextInt();
            nations.put(name,population);
        }
        name = "";
        while(true){
            System.out.print("인구 검색>>");
            name = s.next();
            Integer key = nations.get(name);
            if(name.equals("그만")){
                break;
            }
            if(key == null){
                System.out.println(name +"나라는 없습니다.");
            }else{
                System.out.println(name +"의 인구는 "+nations.get(name));
            }
        }
    }
}
