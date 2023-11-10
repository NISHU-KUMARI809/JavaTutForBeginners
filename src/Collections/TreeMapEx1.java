package Collections;
import java.util.TreeMap;
public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap <String,Integer>a=new TreeMap<String,Integer>();
        a.put("abc",1);
        a.put("bcd",2);
        a.put("def",4);
        System.out.println(""+a);
        System.out.println(""+a.get("abc"));
    }
    
}
