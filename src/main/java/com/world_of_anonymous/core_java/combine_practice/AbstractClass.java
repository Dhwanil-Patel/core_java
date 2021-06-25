package com.world_of_anonymous.core_java.combine_practice;

abstract class Bank{

    int i;

    public Bank(int i) {
        this.i = i;
    }

    void msg() {
        System.out.println();
    }
    abstract int getRateOfInterest();
    public static void message() {
        System.out.println("Static method not override. Because initialize first");
    }
}
class SBI extends Bank{
    public SBI(int i) {
        super(i);
    }

    int getRateOfInterest(){return 7;}

    public static void message() {
        System.out.println("Child static method not override. Because initialize first");
    }
}
class PNB extends Bank{
    public PNB(int i) {
        super(i);
    }
    int getRateOfInterest(){return 8;}
}

class AbstractClass {
    public static void main(String args[]){

//        Bank b;
//        b=new SBI(5);
//        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
//
//        b.message();
//        b=new PNB(10);
//        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");

        SBI sbi = new SBI(7);
        sbi.message();
    }
}
