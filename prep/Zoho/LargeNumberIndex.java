package prep.Zoho;

public class LargeNumberIndex {
    public static void main(String[] args) {
        int a[]={1,3,6,2};
        int max=0;
        int index=0;
        int flag=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max){
                max=a[i];
                index=i;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (i!=index)
            {
                if (a[i]*2 <= max)
                {
                    flag=1;
                }
                else {
                    flag=0;
                }
            }
        }
        if (flag==1){
            System.out.println(index);
        }
        else {
            System.out.println("-1");
        }
    }
}
