import java.util.*;
public class leaders {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        int[] temp=new int[10];
        for(int k=0;k<arr.length;k++)
        {
            arr[k]=sc.nextInt();
        }
        int n= arr.length-1;
        int j=0;
        temp[j]=arr[n];
        int max=temp[0];
        for(int i=n-2;i>=0;i--)
        {
          
            if(arr[i]>=max)
            {
                max=arr[i];
                j++;
                temp[j]=max;
            }

        }
        System.out.println(Arrays.toString(temp));
    }
    
}
