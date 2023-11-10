package Collections;
import java.util.HashMap;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer>h=new HashMap<String,Integer>();
        h.put("Nishu",121);
        h.put("riya",122);
        h.put("diya",123);
        h.put("jiya",124);
        h.put("priya",125);
        System.out.println(""+h.get("Nishu"));
        System.out.println(""+h);
    }
    
}
