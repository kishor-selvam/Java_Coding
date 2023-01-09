package prep.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter How Many Array Values : ");
        int num=in.nextInt();
        int arr[]=new int[num];

        int ans=0;
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=in.nextInt();
            ans=ans+arr[i];
        }
        System.out.println("Original Array : "+ Arrays.toString(arr));
        System.out.println("Sum Of Array is :  "+ans);
    }
}
