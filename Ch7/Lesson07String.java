/*
Count
Sam Sanft
8/30/2017
Computer Programming 2, Period 1
*/
import java.io.*;
import java.util.*;
public class Lesson07String {
    public static void main(String args[])
    {
        do
        {
            System.out.println("\nSam Sanft");
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Enter your String here: ");
            String s1 = kbReader.next();
            System.out.println("This is the first part of the String.... " + s1);
            System.out.print("Enter your String here: ");
            String s2 = kbReader.next();
            System.out.println("This is the next part of the String.... " + s2);
            System.out.println("\nThis is the String concatenated:\n" + s1 + " " + s2);
        }while(true);
    }
}