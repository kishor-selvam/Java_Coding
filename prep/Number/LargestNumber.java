package prep.Number;

import java.util.Scanner;

public class LargestNumber {

    static void largest(int a,int b,int c){
        // Using Normal Condition
        if (a>b && a>c) {
            System.out.println(a+" is Greater");
        } else if (b>a && b>c) {
            System.out.println(b+" is Greater");
        } else if (c > a && c > b) {
            System.out.println(c+" is Greater");
        }
    }
    static void largestnum(int a,int b,int c){
        // Using Ternary Operator
        int lar=a > b ? a : b ;
        int lar1=c>lar? c:lar;
        System.out.println("Largest Number is : "+lar1);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter First Number : ");
        a=in.nextInt();
        System.out.println("Enter Second Number : ");
        b=in.nextInt();
        System.out.println("Enter Third Number : ");
        c=in.nextInt();
        System.out.println("----------------------");
        largestnum(a,b,c);
    }

}
