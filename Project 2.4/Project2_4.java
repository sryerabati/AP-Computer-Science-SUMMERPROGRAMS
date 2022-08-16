 /**
 * Shreyas Yerabati
 * 8/15/22
 * Project 2.4
 * Receive the temperature from the user
 * 
 * Variable List:
 *  temp = Temperature as inputted by the user
 */

import java.util.Scanner;

public class Project2_4
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the temperature?");
        double temp = scan.nextDouble();
        
        if (temp < 30) {
        System.out.println("Ouch, it's freezing!");
    }
        else if (temp < 50) {
            System.out.println("Oof, quite chilly.");
        
        }
        else if (temp < 70) {
            System.out.println("Quite favorable weather today. My favorite!");
        }
        else if (temp < 90) {
            System.out.println("Is it just me or is it feeling stuffy in here?");
        }
        else if (temp < 100) {
            System.out.println("Oh my word, it really is quite hot today!");
        }
        else {
        System.out.println("MAYDAY! MAYDAY! SYSTEMS OVERHEATING!");
}
}
}