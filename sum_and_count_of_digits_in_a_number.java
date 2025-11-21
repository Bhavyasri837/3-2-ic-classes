import java.util.*;
public class sum_and_count_of_digits_in_a_number {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int count=0;
        while(n!=0)
        {
            int dig=n%10;
            sum=sum+dig;
            n=n/10;
            count++;
        }
        System.out.println("sum="+sum);
        System.out.println("count="+count);
    }
}
