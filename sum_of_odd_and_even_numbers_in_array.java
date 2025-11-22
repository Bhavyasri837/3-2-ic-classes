import java.util.*;
public class sum_of_odd_and_even_numbers_in_array {
    public static void main(String args[])
    {
        int[] arr={12,13,14,2,3,5,7,4};
        int oddsum=0;
        int evensum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evensum+=arr[i];
            }
            else
            {
                oddsum+=arr[i];
            }
        }
        System.out.println("sum of even numbers in an array:"+evensum);
        System.out.println("sum of odd numbers in an array:"+oddsum);
    }
}
