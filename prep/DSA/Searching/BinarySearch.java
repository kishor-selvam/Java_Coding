package prep.DSA.Searching;

public class BinarySearch {

    private static void Binary(int a[],int tar){
        int low=0,high=a.length-1;

        boolean flag = false;

        while (low<=high){
            int mid=(low+high)/2;
            if (a[mid]==tar){
                System.out.println(tar+" Index : "+mid);
                flag=true;
                break;
            }
            if(a[mid] < tar){
                low=mid+1;
            }
            if(a[mid] > tar){
                high=mid-1;
            }
        }
        if (flag==false){
            System.out.println("Not Found");
        }
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,50,60,80,90};
        int target=30;
        Binary(arr,target);
    }
}
