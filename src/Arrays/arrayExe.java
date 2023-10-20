package Arrays;
import java.util.Scanner;
public class arrayExe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The values are:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

    }



}
