package Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> ar=new ArrayList<String>();
        ar.add("abc");
        ar.add("bcd");
        ar.add("def");
        ar.add("sef");
        //System.out.println(""+ar);
        Iterator itr=ar.iterator();
        while(itr.hasNext()){
            System.out.println(""+itr.next());
        }
        
    }
}
