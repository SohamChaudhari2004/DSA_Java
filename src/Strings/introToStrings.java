package Strings;

import java.io.PrintStream;

public class introToStrings {
    public static void main(String[] args) {
        String a = "kunal"; // object kunal stored in mem pool
        String b = "kunal";

        a= "soham"; // creation of new object soham in memory pool
        System.out.println(a + b);


        String c  = new String("soham");
        String d  = new String("soham");
        System.out.println(d == c); // false
        System.out.println(c.equals(d)); // true
        System.out.println(c.charAt(3));

//        printstream Class

//        StringBuilder

    }
}
