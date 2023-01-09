package prep.Number;

import java.util.Scanner;

public class PrimeNumber {

    static void primecheck(int n){
        int c=0;
        if (n>1)
        {
            for (int i = 1; i <=n ; i++) {
                if (n%i==0)
                {
                    c++;
                }
            }
            if (c==2)
            {
                System.out.println(n+ " Prime Number");
            }
            else
            {
                System.out.println(n+" Not Prime Number");
            }
        }
        else
        {
            System.out.println(n+" Not Prime Number");
        }
    }

    static void primerange(int s,int e) {
        int c = 0;
        System.out.print("Prime Number : ");
        for (int i = s; i <= e; i++) {
            for (int j = 1; j <=i ; j++) {
                if (i%j==0){
                    c++;
                }
            }
            if (c==2){

                System.out.print(i+" ");
            }
            c=0;

        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //System.out.println("Enter Number To Check Prime Or Not : ");
        //int num=in.nextInt();
        //primecheck(num);
        int s,e;
        System.out.println("Enter Starting Number : ");
        s=in.nextInt();
        System.out.println("Enter Ending Number : ");
        e=in.nextInt();
        primerange(s,e);

    }
}
