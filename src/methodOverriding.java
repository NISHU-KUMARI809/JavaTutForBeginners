public class methodOverriding {
    public int add(int a,int b){
        return a+b;
    }
}
 class java extends methodOverriding{
    public int add(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {
        methodOverriding obj=new methodOverriding();
        int y=obj.add(20,30);
        java j=new java();
       int x=j.add(30,40);
        System.out.println(x);
        System.out.println(y);

    }
}
