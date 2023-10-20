package Arrays;
import java.util.Scanner;
public class Twodarray {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of 1st elements:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the value of 2nd element:");
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                c[i][j]=0;
                for(int k=0;k<a.length;k++){
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }


            }
        }
        System.out.println("Multiplication is equal to:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
