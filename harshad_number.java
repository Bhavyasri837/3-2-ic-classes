import java.util.*;
public class harshad_number {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.println("the given number is an harshad number.");
        }
        else{
            System.out.println("not a harshad number.");
        }
    }
    
}
