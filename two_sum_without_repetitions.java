import java.util.*;
public class two_sum_without_repetitions
 {
    public static void target(int[] arr,int target)
    {
        boolean status=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target){
                    status=true;
                    System.out.println(arr[i]+"+"+arr[j]+"="+target);
                }
            }
        }
        if(!status)
        {
            System.out.println("no pair found!");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int k=0;k<arr.length;k++)
        {
            arr[k]=sc.nextInt();
        }
        int target=sc.nextInt();
        target(arr, target);
    }
}

