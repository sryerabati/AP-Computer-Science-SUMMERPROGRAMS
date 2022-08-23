 /**
 * Shreyas Yerabati
 * 8/15/22
 * Project 2.4
 * Receive the temperature from the user
 * 
 * Variable List:
 *  cel = Temperature as inputted by the user
 *  fah = Fahrenheit, result of celsius conversion
 */

import java.util.Scanner;

public class Project2_4
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the temperature (Celsius)?");
        double cel = scan.nextDouble();
        
        double fah = (cel*1.8)+32;
        
        System.out.println();
        System.out.println(cel + " degrees celsius in fahrenheit is "+ fah + " degrees.");
        
       }
}