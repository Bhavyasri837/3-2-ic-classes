import java.util.*;
public class two_sum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int k=0;k<arr.length;k++)
        {
            arr[k]=sc.nextInt();
        }
        two_sum(arr);
    }
        public static void two_sum(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==10)
                {
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
    }
}
