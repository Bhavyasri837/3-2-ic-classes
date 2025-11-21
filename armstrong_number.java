import java.util.*;
public class armstrong_number {
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int num=n;
    int sum=0;
    while(n!=0)
    {
        int dig=n%10;
        sum=sum+(dig*dig*dig);
        n=n/10;
    }
    if(sum==num)
    {
        System.out.println("it is a armstrong number.");
    }
    else{
        System.out.println("not an armstrong number.");
    }
 }
 }   

