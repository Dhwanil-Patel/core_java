package com.world_of_anonymous.core_java.combine_practice;

interface enumInterface {
    int day();
}

enum Day implements enumInterface {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    @Override
    public int day() {
        return ordinal() + 1;
    }
}

public class ImplementInterfaceInEnum {
    public static void main(String[] args) {
        System.out.println("It is day number "+Day.WEDNESDAY.day()+" of week");
    }
}
