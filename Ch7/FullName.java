/*
Count
Sam Sanft
8/30/2017
Computer Programming 2, Period 1
*/
import java.io.*;
import java.util.*;
public class FullName {
    public static void main(String args[])
    {
        System.out.println("\nSam Sanft\n");
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String name1 = kbReader.next();
        System.out.print("What is your last name? ");
        String name2 = kbReader.next();
        System.out.println("\nYour full name is " + name1 + " " + name2);
    }
}