package prep.DSA.Searching;

public class LinearSearch {

    private static void linear(int[] arr){
        int tar=3;
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==tar){
                System.out.println("The Target Value "+tar+" in Index : "+i);
                flag=true;
            }
        }
        if (flag==false){
            System.out.println("There is no value in Array");
        }
    }

    public static void main(String[] args) {
        int a[]={4,6,2,3,5};
        linear(a);
    }
}
