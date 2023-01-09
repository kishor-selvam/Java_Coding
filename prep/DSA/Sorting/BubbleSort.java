package prep.DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {

    private static void Bubble(int[] a,int len){

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Array After Sorting : "+Arrays.toString(a));
    }
    public static void main(String[] args) {
        int arr[]={4,2,1,6,7,3};
        int length=arr.length-1;
        System.out.println("Array Before Sorting : "+ Arrays.toString(arr));
        Bubble(arr,length);
    }
}
