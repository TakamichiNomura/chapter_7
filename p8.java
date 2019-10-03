import java.util.*;
/**
 * Write a description of class p8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p8
{
    public static void main(String[] args){
        HashMap<String, Integer> h = new HashMap<String,Integer>();
        Vector<Integer> v = new Vector<Integer>();
        ArrayList<String> al = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        System.out.println(" ** 포인트 관리 프로그램입니다. ** ");
        while(true){
            System.out.print("이름과 포인트 입력>>");
            String name = s.next();
            if(name.equals("그만")){
                break;
            }
            int point = s.nextInt();
            for(int i = 0;i<al.size();i++){
                if(name.equals(al.get(i))){
                    point = point + v.get(i);
                }
            }
            h.put(name,point);
            Iterator<String> it = h.keySet().iterator();
            while(it.hasNext()){
                System.out.print("("+ it.next() +","+ h.get(name) +")");
            }
            System.out.print("\n");
            v.add(point);
            al.add(name);
        }
    }
}
