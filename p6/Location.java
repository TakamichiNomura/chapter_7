package p6;


/**
 * Write a description of class Location here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location
{
    String name;
    int keido,ido;
    public Location(String a,int b,int c){
        this.name = a;
        this.keido = b;
        this.ido = c;
    }
    public String toString(){
        return this.name +" "+ this.keido +" "+ this.ido;
    }
}
