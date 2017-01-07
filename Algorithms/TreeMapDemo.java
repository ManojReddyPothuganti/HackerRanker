import java.util.*;
public class TreeMapDemo{

     public static void main(String []args){
        System.out.println("Hello World");
        TreeMap tm = new TreeMap();
        tm.put(5,1);
        tm.put(2,1);
        tm.put(1,1);
        tm.put(8,1);
        tm.put(10,0);
        tm.put(5,0);
        System.out.println(tm);
     }
}
