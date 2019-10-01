import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class chapter_3
{
    public static int n[][] = new int[4][4];
    static int m[] = new int[4];
    static int i = 0,j = 0;
    public static void main(String[] args){
        int count = 0;
        for(int i = 0;i<n.length;i++){
            for(int j = 0;j<n[i].length;j++){
                n[i][j] = (int)(Math.random()*9+0);
                m[j] = n[i][j];
                if(n[i][j] != 0){
                    count ++;
                }
                if(count > 10){
                    n[i][j] = 0;
                }
            }
        }
        count = 0;
        j = 0;
        for(int i = 0;i<n.length;i++){
            while(j > 4){
                if((m[j] == n[i][count]) && n[i][count] != 0){
                    n[i][j] = (int)(Math.random()*9+0);
                    while(n[i][j] != m[j]){
                        n[i][j] = (int)(Math.random()*9+0);
                    }
                }
                count ++;
                if(count == 4){
                    j++;
                    count = 0;
                }
            }
        }
        for(int i = 0;i<n.length;i++){
            for(int j = 0;j<n[i].length;j++){
                System.out.print(n[i][j] +" ");
            }
            System.out.println();
        }
    }
}
