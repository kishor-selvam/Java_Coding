package prep.Number;
import java.util.*;
public class GenerateRandom {
    public static void main(String[] args) {
        Random r=new Random();
        int random=r.nextInt(10);

        System.out.println(random);
    }
}
