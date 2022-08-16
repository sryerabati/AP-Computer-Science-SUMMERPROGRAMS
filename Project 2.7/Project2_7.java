
/**
 * Shreyas Yerabati
 * 8/15/22
 * Project 2.7
 * To show the use of the % operator
 * 
 * Variable List:
 *  sides = number of sides of the shape name displayed
 *  num = number of sides inputted by the user
 */

import java.util.Scanner;
public class Project2_7
{
    public static void main(String[] args) 
    {
        int sides = 7; // declaration with initialization
        System.out.println ("A heptagon has " + sides + " sides.");
        sides = 10; // assignment statement
        System.out.println ("A decagon has " + sides + " sides.");
        sides = 12;
        System.out.println ("A dodecagon has " + sides + " sides.");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number of sides (Less than 12):");
        int num = scan.nextInt();
        if (num>12) {
            System.out.println("I said to enter a number less than 12...");
        }
        else {
            System.out.println("If a dodecagon side amount was divided with");
            System.out.println("the inputted side amount, it would have a");
            System.out.println("remainder of " + (sides%num) +".");
        }
    }
}
