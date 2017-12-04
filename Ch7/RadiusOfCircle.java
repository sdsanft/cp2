/*
Count
Sam Sanft
8/30/2017
Computer Programming 2, Period 1
*/
import java.io.*;
import java.util.*;
import java.lang.Math.*;
public class RadiusOfCircle {
    public static void main(String args[])
    {
        System.out.println("\nSam Sanft\n");
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is the area? ");
        double a = kbReader.nextDouble();
        double r = Math.sqrt(a/Math.PI);
        System.out.println("The radius of your circle is " + r);
    }
}