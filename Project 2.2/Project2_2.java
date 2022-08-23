
/**
 * Shreyas Yerabati
 * 8/15/22
 * Project 2.2
 * Read 3 Numbers into 3 Different Variables
 * Variable List:
 *  num1 = 1st Favorite Number
 *  num2 = 2nd Favorite Number
 *  num3 = Least Favorite Number
 *  avg = avg of 3 numbers
 */ 

import java.util.Scanner;

public class Project2_2
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter your 1st favorite number!");
        double num1 = scan.nextDouble();
        System.out.println("Enter your 2nd favorite number!");
        double num2 = scan.nextDouble();
        System.out.println("Enter your least favorite number!)");
        double num3 = scan.nextDouble();
        double avg = (num1+num2+num3)/3;
        System.out.println();
        System.out.println("Your favorite number is " + num1 + ".");
        System.out.println("Your 2nd favorite number is "+ num2 + ".");
        System.out.println("Your least favorite number is " + num3 + ".");
        System.out.println("Lastly, the average of all numbers is " + avg +".");
        
        
    }
    
}
