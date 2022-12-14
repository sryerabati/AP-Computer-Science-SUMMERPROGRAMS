
/**
 * Shreyas Yerabati
 * 8/15/22
 * Project 2.3
 * Display use of Quotient, remained, and power operations.
 * 
 * Variable List:
 *  numA = first number
 *  numB = second number
 *  quo = quotient of A / B
 *  rem = remainder of A / B
 *  pow = result of A to the power of B
 *  sum = sum of A and B
 *  diff = difference of A and B
 *  prod = product of A and B
 *  
 */

import java.util.Scanner;


public class Project2_3
{
    public static void main(String[]args)
    {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter a number for A:");
        double numA = scan.nextDouble();
        System.out.println();
        System.out.println("Enter a number for B:");
        double numB = scan.nextDouble();
        
        double quo = numA/numB;
        double rem = numA % numB;
        double pow = Math.pow( numA, numB);
        double sum = numA + numB;
        double diff = numA - numB;
        double prod = numA*numB;
        
        
        
        
        System.out.println();
        System.out.println();
        System.out.println("A plus B = " + sum);
        System.out.println("A minus B = " + diff);
        System.out.println("A times B = " + prod);
        System.out.println("A divided by B is "+ quo);
        System.out.println("The remainder of A divided by B is "+ rem);
        System.out.println("A to the power of B = "+ pow);
    }





}
