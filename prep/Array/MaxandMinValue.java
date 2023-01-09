package prep.Array;

public class MaxandMinValue {
    public static void main(String[] args) {
        int arr[]={20,5,65,32,12,88,54,34};
        int max=arr[0];
        int min=arr[0];

        for (int i = 0; i < arr.length; i++) {

            if ( arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println("The Maximum Value Of Array Is : "+max);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The Minimam Value Of Array Is : "+min);
    }
}
