package prep.Number;

public class SwapNumbers {
    public static void main(String[] args) {
        int a=5,b=8;
        System.out.println("Before Swapping Two Variables : "+"A = "+a+" | "+"B = "+b);
        //Using Third Variable Method

        /*
        int temp=a;
        a=b;
        b=temp;
*/
        //With Out Using Third Variable
/*
        a=a+b;
        b=a-b;
        a=a-b;
*/
        System.out.println("After Swapping Two Variables  : "+"A = "+a+" | "+"B = "+b);


    }
}
