package ConstructorInJava;

public class parametrizedCons {
    int age;
    String name;
    parametrizedCons(int x,String y){
        age=x;
        name=y;
    }
    void display(){
        System.out.println(age);
        System.out.println(name);
    }

    public static void main(String[] args) {
        parametrizedCons p=new parametrizedCons(20,"nishu");
        p.display();
    }
}
