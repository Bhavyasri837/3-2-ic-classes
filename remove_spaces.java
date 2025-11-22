import java.util.*;
public class remove_spaces {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
                count++;
        }
        String str1=str.replaceAll(" ", "");
        System.out.println(count);
        System.out.println(str1);
    }
    
}
