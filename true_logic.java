import java.util.*;
public class true_logic {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=1;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            val=val*i;
        }
        if(n==val)
        System.out.println("is an true logic");
        else
        System.out.println("not a true logic");
        }
    }
    

