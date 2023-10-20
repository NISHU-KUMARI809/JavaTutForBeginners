public class methodOverloading {
    public int demo(int x,int y){
        return x+y;
    }
    public double demo(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        methodOverloading m1=new methodOverloading();
        int z=m1.demo(20,30);
        double s=m1.demo(2.2,3.3);
        System.out.println(z);
        System.out.println(s);
    }
}
