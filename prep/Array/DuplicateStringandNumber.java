package prep.Array;

public class DuplicateStringandNumber {

    static void dupstring(String[] s){
        boolean check=false;

        for (int i = 0; i < s.length; i++) {
            for (int j = i+1; j < s.length; j++) {
                if (s[i]==s[j])
                {
                    System.out.println("Duplicate String is : "+s[i]);
                    check=true;
                }
            }
        }
        if (check==false)
        {
            System.out.println("There is No Duplicate Strings in Array");
        }
    }
    static void dupstring(int[] s){
        boolean check=false;

        for (int i = 0; i < s.length; i++) {
            for (int j = i+1; j < s.length; j++) {
                if (s[i]==s[j])
                {
                    System.out.println("Duplicate Number is : "+s[i]);
                    check=true;
                }
            }
        }
        if (check==false)
        {
            System.out.println("There is No Duplicate Values in Array");
        }
    }

    public static void main(String[] args) {
        String[] string={"c","c++","python","java","c++"};
        int[] num={5,4,65,7,5,4,9};
        dupstring(num);




    }
}
