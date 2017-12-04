/*
Count
Sam Sanft
8/30/2017
Computer Programming 2, Period 1
*/
import java.io.*;
import java.util.*;
public class Lesson07Int {
    public static void main(String args[])
    {
        do
        {
            System.out.println("\nSam Sanft");
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Enter your integer here: ");
            int i = kbReader.nextInt();
            System.out.println(3 * i);
        }while(true);
    }
}