import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shinsu
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        System.out.print(">>");
        int n = s.nextInt();
        int shou,result;
        int count = 0;
        while(true){
            shou = n / 2;
            result = n % 2;
            sb.append(result);
            n = shou;
            count += 1;
            if(n < 1){
                sb.reverse();
                System.out.print(sb);
                System.exit(0);
            }
        }
    }
}


