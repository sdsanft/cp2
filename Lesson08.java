/*
Count
Sam Sanft
8/30/2017
Computer Programming 2, Period 1
*/
import java.io.*;
import java.util.*;
public class Lesson08 {
    public static void main(String args[])
    {
        System.out.println("\nSam Sanft\n");
        System.out.println("1. " + !true);
        System.out.println("2. " + !false);
        System.out.println("3. " + !(3 < 5));
        System.out.println("4. " + !(1 == 0));
        
        int x = 79, y = 46, z = -3;
        double d = 13.89, jj = 40.0;
        boolean b = true, c = false;
        
        
        System.out.println("\nVariables and their values\n\n" + 
            "int x = 79, y = 46, z = -3;" + 
            "double d = 13.89, jj = 40.0;" + 
            "boolean b = true, c = false;");
        System.out.println("1.  true && false         = " + (true && false));
        System.out.println("2.  true && !false        = " + (true && !false));
        System.out.println("3.  c || (d > 0)          = " + (c || (d > 0)));
        System.out.println("4.  !b || c               = " + (!b || c));
        System.out.println("5.  (x > 102) && true     = " + ((x > 102) && true));
        System.out.println("6.  (jj == 1) || false    = " + ((jj == 1) || false));
        System.out.println("7.  (jj == 40) && ! false = " + ((jj == 40) && ! false));
        System.out.println("8.  x != 3                = " + (x != 3));
        System.out.println("9.  !(x != 3)             = " + (!(x != 3)));
        System.out.println("10. !!true                = " + (!!true));
        
    }
}