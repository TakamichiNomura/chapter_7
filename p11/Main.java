package p11;
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
        Scanner s = new Scanner(System.in);
        Nation nt;
        Vector<Nation> v = new Vector<Nation>();
        ArrayList<String> array_name = new ArrayList<String>();
        var array_capital = new ArrayList<String>();
        System.out.println(" *** 수도 맞추기 게임을 시작합니다.*** ");
        while(true){
            System.out.print("입력:1, 퀴즈:2, 종료:3>>");
            int num_1 = s.nextInt();
            int i = 0,j = 0;
            if(num_1 == 1){
                System.out.println("현재 "+ v.size() +"개 나라와 수도가 입력되어 있습니다.");
                while(true){
                    System.out.print("나라와 수도 입력"+ v.size() +">>");
                    String name = s.next();
                    if(name.equals("그만")){
                        break;
                    }
                    array_name.add(j,name);
                    String capital = s.next();
                    array_capital.add(j,capital);
                    nt = new Nation(name,capital);
                    for(i = 0;i<v.size();i++){
                        if(name.equals(array_name.get(i))){
                            System.out.println(name +"는 이미 있습니다!");
                        }
                    }
                    v.add(j,nt);
                    j++;
                }
            }else if(num_1 == 2){
                while(true){
                    int rand = (int)(Math.random()*v.size() + 1);
                    System.out.print(array_name.get(rand) +"의 수도는?");
                    String name = s.next();
                    if(name.equals("그만")){
                        break;
                    }
                    if((array_capital.get(rand)).equals(name)){
                        System.out.println("정답!!");
                    }else{
                        System.out.println("아닙니다!!");
                    }
                }
            }else if(num_1 == 3){
                System.out.println("시스템을 종료하겠습니다.");
                s.close();
                System.exit(0);
            }
        }
    }
}
