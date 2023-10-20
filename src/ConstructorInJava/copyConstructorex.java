package ConstructorInJava;
public class copyConstructorex {
    String name;
    int age;
    copyConstructorex(String x,int y){
        name=x;
        age=y;
    }
    copyConstructorex(copyConstructorex c){
        name=c.name;
        age=c.age;
    }
    void display(){
        System.out.println("The name of person is:"+name);
        System.out.println("The age of the person is:"+age);
    }

    public static void main(String[] args) {
        copyConstructorex x=new copyConstructorex("Nishu",20);
        x.display();
    }
}
