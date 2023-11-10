package Collections;
import java.util.TreeMap;
public class TreeMapex {
    public static void main(String[] args) {
        TreeMap<Integer,String> ar=new TreeMap<Integer,String>();
        ar.put(1, "ABC"); // key values 1 is key and value is abc
        ar.put(2,"BCD");
        ar.put(3,"DEF");
        System.out.println(""+ar.get(1));
        System.out.println(""+ar);
    }
    
}
