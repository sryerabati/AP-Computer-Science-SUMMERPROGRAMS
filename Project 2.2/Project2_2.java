
/**
 * Shreyas Yerabati
 * 8/15/22
 * Project 2.2
 * Read 3 Numbers into 3 Different Variables
 * Variable List:
 *  num1 = 1st Favorite Number
 *  num2 = 2nd Favorite Number
 *  num3 = Least Favorite Number
 */ 

import java.util.Scanner;

public class Project2_2
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter your 1st favorite number!");
        int num1 = scan.nextInt();
        System.out.println("Enter your 2nd favorite number!");
        int num2 = scan.nextInt();
        System.out.println("Enter your least favorite number!)");
        int num3 = scan.nextInt();
        
        System.out.println();
        System.out.println("Your favorite number is " + num1 + ".");
        System.out.println("Your 2nd favorite number is "+ num2 + ".");
        System.out.println("Lastly, your least favorite number is " + num3 + ".");
        
        
    }
    
}
