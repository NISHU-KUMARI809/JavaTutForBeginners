package InterfaceExe;
class demo{
    void message(){
        System.out.println("HII");
    }
    void name(){
        System.out.println("Hello");
    }
}
public class SingleInheritance extends demo {
    public static void main(String[] args) {
        SingleInheritance s=new SingleInheritance();
        s.name();
        s.message();

    }


}
