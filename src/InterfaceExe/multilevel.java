package InterfaceExe;
class animal{
    void dog(){
        System.out.println("this is a dog");
    }
}
class Bird extends animal{
    void bird(){
        System.out.println("This is a pigeon");
    }
}
class Zoo extends Bird{
    void animals(){
        System.out.println("z000");
    }
}


class multilevel {
    public static void main(String[] args) {
        Zoo z=new Zoo();
        z.animals();
        z.dog();
        z.bird();


    }
}
