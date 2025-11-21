 import java.util.*;
public class prime_number_along_with_serial_number {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sno=1;
        for(int j=2;j<=n;j++)
        {
            int num=j;
            int count=0;
            for(int i=2;i<=num/2;i++){
                if(num%i==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                sno++;
            }
        }
        System.out.println(sno+")"+n);
        
    }
    
}