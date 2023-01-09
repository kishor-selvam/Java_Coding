package prep.Array;
/* Find The Duplicates using HashSet & TreeSet*/
import java.util.HashSet;
import java.util.Scanner;

public class Duplicate {



        public static void main(String args[]) {
            Scanner in =new Scanner(System.in);
            int arr[] = {9,4,88,7,4,77,7,5,1};
            HashSet<Integer> s=new HashSet<Integer>();

            for (int i=0 ; i<arr.length; i++)
            {
                if (s.contains(arr[i]))
                {
                    System.out.println("Duplicate Values : "+arr[i]);
                }
                else
                {
                    s.add(arr[i]);
                }

            }
            System.out.println("________________________________________");
            System.out.println("After Remove The Duplicates : "+s);
        }

    }

