package edu.cnm.deepdive;

public class AboutEquality {

  public static void main(String[] args) {

    StringBuilder one = new StringBuilder();
    StringBuilder two = new StringBuilder();
    StringBuilder three = one.append("Java");

    System.out.println("is one == two: " + (one == two));// prints false because one and two are two
    //totally different StringBuilder objects.
    System.out.println("is one == three: " + (one == three));//prints true because the append method
    //returns the same StringBuilder object (one) and one is assigned to three.

    String x = "Java";//will be added to the String pool
    String y = "Java";//Java will first check the String pool
    System.out.println();
    System.out.println("is x == y: " + (x == y));//prints true because of the String pool

    String a = "Java";
    String b = "Java".trim();
    System.out.println();
    System.out.println("is a == b: " + (a == b));//will print true because nothing happens with the
    //trim method so Java for String b can be found in the String pool.

    String c = "Java";
    String d = "Java ".trim();
    System.out.println();
    System.out.println("is c == d: " + (c == d));//will print false because d is not a String literal
    //and since Strings are immutable, a new String will be created.


  }
}
