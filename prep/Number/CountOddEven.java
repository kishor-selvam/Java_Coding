package prep.Number;

import java.util.Scanner;

public class CountOddEven {

    static void oddeven(int n){
        int check=0;
        int odd=0;
        int even=0;
        while (n!=0){
            check=n%10;
            if (check%2==0){
                even++;
            }
            else if (check%2!=0) {
                odd++;
            }
            n=n/10;
        }
        System.out.println("Total Even Number Count : "+even);
        System.out.println("Total Odd Number Count  : "+odd);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=in.nextInt();
        oddeven(num);
    }
}
