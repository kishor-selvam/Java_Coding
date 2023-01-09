package prep.String;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s=in.nextLine();
        String ans="";
        // Simple Logic
        /*

        for (int i=s.length()-1;i>=0;i--){
            ans=ans+s.charAt(i);
        }
        System.out.println(ans);
        */

        // Using Character Array
/*
        char arr[]=s.toCharArray();
        int len=s.length()-1;
        for (int i=len;i>=0;i--)
        {
            ans=ans+arr[i];
        }
        System.out.println(ans);
        */

        StringBuffer s1=new StringBuffer(s);
        System.out.println(s1.reverse());
    }
}
