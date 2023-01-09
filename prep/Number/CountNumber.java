package prep.Number;

import java.util.Scanner;

public class CountNumber {
    static void count(int n){
        int c=0;
        while (n>0)
        {
            n=n/10;
            c++;
        }
        System.out.println("Total Number of Element is : "+ c);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=in.nextInt();
        count(num);
    }
}
