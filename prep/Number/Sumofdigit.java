package prep.Number;
import java.util.Scanner;

public class Sumofdigit {

    static void sumofdigit(int n){
        int dup=n;
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n/=10;
        }
        System.out.println(dup+" Total Sum of Digit is : "+sum);
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=in.nextInt();
        sumofdigit(num);
    }
}
