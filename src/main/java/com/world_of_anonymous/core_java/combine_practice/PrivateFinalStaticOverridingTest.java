package com.world_of_anonymous.core_java.combine_practice;

public class PrivateFinalStaticOverridingTest {

    public static void main(String args[]) {

        Base b = new Derived();
        System.out.println(b.version());
        System.out.println(b.name());

    }

}

class Base{

    public final String version(){
        where(); // This will call Base class where() method
        return "1.0.0";
    }

    public static String name(){
        return "Base";
    }

    private void where(){
        System.out.println("Inside Base Class");
    }
}

class Derived extends Base{

//     Compilation Error : Final method can't be overridden in Java
//    public final String version(){
//        return "2.0.0";
//    }

    // Hidden static method - Same Signature but bonded at compile time
    public static String name(){
        return "Derived";
    }

    // Hidden private method - Same signature but resolved at compile time
    private void where(){
        System.out.println("Inside Derived Class");
    }
}
