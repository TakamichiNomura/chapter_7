package p11;
import java.util.*;

/**
 * Write a description of class hash_main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hash_main
{
    public static void main(String[] args){
        var hm = new HashMap<String,String>();
        var ar_country = new ArrayList<String>();
        var ar_city = new ArrayList<String>();
        ar_country.add(0," ");
        ar_city.add(0," ");
        int i = 1;
        
        Scanner s= new Scanner(System.in);
        System.out.println(" *** 수도 맟주기 게임을 시작합니다. ***");
        while(true){
            System.out.print("입력:1, 퀴즈:2, 종료:3 >>");
            int num_1 = s.nextInt();
            switch(num_1){
                case 1:
                System.out.println("현재 "+ hm.size() +"개 나라와 수도가 입력되어 있습니다.");
                while(true){
                    System.out.print("나라와 수도 입력"+ hm.size() +">>");
                    String country = s.next();
                    if(country.equals("그만")){
                        break;
                    }   
                    ar_country.add(i,country);
                    Iterator it = hm.keySet().iterator();
                    while(it.hasNext()){
                        if(country.equals(it.next())){
                            System.out.println(country +"는 이미있습니다.");
                        }
                    }
                    String city = s.next();
                    ar_city.add(i,city);
                    hm.put(country,city);
                    i++;
                }
                break;
                case 2:
                while(true){
                    int rand = (int)(Math.random()*hm.size()+1);
                    System.out.print(ar_country.get(rand) +"의 수도는?");
                    String name = s.next();
                    if(name.equals("그만")){
                        break;
                    }
                    if(name.equals(ar_city.get(rand))){
                        System.out.println("정답!");
                    }else{
                        System.out.println("아닙니다!");
                    }
                }
                break;
                case 3:
                System.out.println("게임을 종료합니다.");
                s.close();
                System.exit(0);
            }
        }
    }
}
