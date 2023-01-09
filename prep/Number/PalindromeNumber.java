package prep.Number;
import java.util.Scanner;

public class PalindromeNumber {

     static void palindrome(int n){
        int dup=n;
        int rev=0;
        while (dup!=0)
        {
            rev=rev*10 + dup%10;
            dup/=10;
        }
        if ( n == rev)
        {
            System.out.println(n + " Palindrome");
        }
        else
        {
            System.out.println(n+ " Not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=in.nextInt();
        palindrome(num);
    }
}
