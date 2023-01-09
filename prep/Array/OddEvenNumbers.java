package prep.Array;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n=in.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.print("Even Number of Array : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0)
            {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Odd Number of Array : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
