import java.util.*;

class A {
    int a = 10;
    int b = 20;

    A() {
        System.out.println("Class A Constructor");
        System.out.println("a = " + a + ", b = " + b);
    }
}

class B extends A {
    int c = 30;

    B() {
        System.out.println("Class B Constructor");
        System.out.println("c = " + c);
    }
}

public class multi_level_inheritance extends B {
    int d = 40;

    () {
        System.out.println("Class Multi_Level_Inheritance Constructor");
       System.out.println("d = " + d);
    }

    public static void main(String[] args) {
        multi_level_inheritance  ob = new multi_level_inheritance ();
    }
}
