// Find Missing Number To Ascending Order Number
package prep.Array;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={2,3,5,6};
        int sumoforiginalarr=0;
        int sumofrangearr=0;
        int ans;

        for (int i = 0; i < arr.length; i++) {
            sumoforiginalarr = sumoforiginalarr + arr[i];
        }
        for (int i = 2; i <= 6; i++) {

            sumofrangearr=sumofrangearr+i;

        }
        ans=sumofrangearr-sumoforiginalarr;
        System.out.println(Arrays.toString(arr));
        System.out.println("Missing Number is : "+ans);
    }
}
