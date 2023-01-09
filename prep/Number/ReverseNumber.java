package prep.Number;
import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num=in.nextInt();

        //Best Logic Method

/*        int dup=num;
        int rev=0;
        System.out.println("Before Reverse The Number : "+num);
        while(dup != 0) {
            rev=rev*10 + dup%10;
            dup=dup/10;
        }
        System.out.println("After Reverse The Number  : "+rev);
*/
        // Using StringBuffer

        StringBuffer s=new StringBuffer(String.valueOf(num));
        StringBuffer rev=new StringBuffer();
        rev=s.reverse();
        System.out.println(rev);
    }
}
