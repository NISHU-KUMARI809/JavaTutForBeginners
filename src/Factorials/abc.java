package Factorials;
import java.util.Scanner;
public class abc {
    public void fact(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x=sc.nextInt();
        int f=1;
        for(int i=1;i<=x;i++){
            f=f*i;
        }
        System.out.println(f);
    }
}
