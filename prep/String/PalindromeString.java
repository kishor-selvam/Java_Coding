package prep.String;

import java.util.Scanner;

public class PalindromeString {

    static void palindrome(String s){
        String dup=s;
        String ans="";
        int len=dup.length()-1;
        for( int i=len;i>=0;i--)
        {
            ans=ans+dup.charAt(i);
        }
        System.out.println(ans);
        if (s.equals(ans))
        {
            System.out.println(ans + " Palindrome");
        }
        else
        {
            System.out.println(ans+ " Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str=in.nextLine();
        palindrome(str);
    }
}
