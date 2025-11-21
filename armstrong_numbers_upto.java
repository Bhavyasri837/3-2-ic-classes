import java.util.*;
public class armstrong_numbers_upto {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=1000;i++)
        {
        int n=i;
    int temp=n;
    int sum=0;
    for(int j=0;n!=0;j++)
    {
        int dig=n%10;
        sum=sum+(dig*dig*dig);
        n=n/10;
    }
    if(temp==sum)
    {
        System.out.println(temp);
    }

    }
}
}
