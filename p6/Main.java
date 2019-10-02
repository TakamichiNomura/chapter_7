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
        String name[] = new String[4];
        System.out.println("도시,경도,위도를 입력하세오");
        int i = 0;
        String city = "";
        for(;i<4;i++){
            System.out.print(">>");
            city = s.next();
            String sity_copy = city;
            int keido = s.nextInt();
            int ido = s.nextInt();
            l = new Location(sity_copy,keido,ido);
            hp.put(city,l);
        }
        System.out.println("___________________________");
        Set<String> keys = hp.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            System.out.println(hp.get(it.next()));
        }
        System.out.println("___________________________");
        while(true){
            System.out.print("도시 이름>>");
            String toshi = s.next();
            it = keys.iterator();
            int count = 1;
            if(toshi.equals("그만")){
                break;
            }
            while(it.hasNext()){
                if(toshi.equals(it.next())){
                    System.out.println(hp.get(toshi));
                    break;
                }
                count ++;
            }
            count ++;
            if(count >= 5){
                System.out.println(toshi +"는 없습니다."); 
            }
        }
    }
}
