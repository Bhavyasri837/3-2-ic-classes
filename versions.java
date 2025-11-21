import java.util.*;
class version1{
    void version1()
    {
        System.out.println("chatting and text messages.");
    }
}
class version2 extends version1{
    version2()
    {
        System.out.println("calls along with features in version1.");
    }
}
class version3 extends version2{
    void version3()
    {
    System.out.println("video calls along with features in version2.");
    }
}
class version4 extends version3{
    void version4()
    {
        System.out.println("meta ai along with features in version4.");
    }

}
public class versions extends version4 {
    public static void main(String args[])
    {
        versions ob=new versions();
        ob.version4();
    }
    
}
