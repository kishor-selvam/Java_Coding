package prep.Array;

public class TwoArrayEqualorNot {
    public static void main(String[] args) {
        int[] arr1={3,4,5,6};
        int[] arr2={3,4,5,1};
        boolean check=true;

        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i])
                {
                    check=false;
                }
                else {
                    check=true;
                }
            }
        }
        else {
            check=false;
        }
        if(check==true){
            System.out.println("Arrays Are Equal");
        }
        else {
            System.out.println("Arrays Are Not Equal");
        }








    }
}
