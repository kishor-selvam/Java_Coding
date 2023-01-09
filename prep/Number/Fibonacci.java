package prep.Number;

import java.util.Scanner;

public class Fibonacci {

    static void fibonacciNum(int n){
        int a=0,b=1,sum=0;
        System.out.print("Fibonacci Series : "+a+" "+b);
        for (int i = 2; i < n; i++) {
            sum=a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num=in.nextInt();
        fibonacciNum(num);
    }
}
