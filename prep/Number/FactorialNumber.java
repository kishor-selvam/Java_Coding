package prep.Number;

import java.util.Scanner;

public class FactorialNumber {

    static int factrecursion(int n){
        if (n>0){
            return n*factrecursion(n-1);

        }
        return 1;
    }

    static void factnormal(int n){
        int f=1;
        for (int i = 1; i <=n ; i++) {
            f=f*i;
        }
        System.out.println("Factorial of "+n+" is : "+f);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=in.nextInt();
        System.out.println("Factorial of "+num+" is : "+factrecursion(num));
        factnormal(num);
    }
}
