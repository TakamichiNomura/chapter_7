package p6;
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
        HashMap<String,Location> hp = new HashMap<String,Location>();
        Location l;
        Scanner s = new Scanner(System.in);
        String name = "";
        System.out.println("도시,경도,위도를 입력하세오");
        for(int i = 0;i<4;i++){
            System.out.print(">>");
            name = s.next();
            l = new Location(s.nextInt(),s.nextInt());
            hp.put(name,l);
        }
        System.out.println("___________________________");
        for(int i = 0;i<4;i++){
            System.out.println(hp.get(name));
        }
        while(true){
            System.out.print("도시 이름>>");
            String city = s.next();
            if(city.equals("그만")){
                break;
            }
            for(int i = 0;i<hp.size();i++){
                if(city.equals(hp.containsKey(name))){
                    System.out.println(hp.get(name));
                }else{
                    System.out.println(name +"는 없습니다."); 
                }
            }
        }
    }
}
