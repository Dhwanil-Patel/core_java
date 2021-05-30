package com.world_of_anonymous.core_java.journaldev;

public class CustomAnnotationMain {
  public static void main(String[] args) {

  }

  @Override
  @CustomAnnotation(author = "Dhwanil", comments = "Main method", date = "Nov 17, 2012", revision = 1)
  public String toString() {
    return "Override to string method!!!";
  }

//  @Deprecated
//  @CustomAnnotation()
}
