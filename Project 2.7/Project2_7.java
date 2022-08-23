
/**
 * Shreyas Yerabati
 * 8/15/22
 * Project 2.7
 * To show the use of the % operator
 * 
 * Variable List:
 *  amount = amount of seconds inputted by user
 *  hr = amount of hours within those seconds
 *  min = amount of minutes within those seconds
 *  sec = amount of leftover seconds
 */

import java.util.Scanner;
public class Project2_7
{
    public static void main(String[] args) 
    {
        System.out.println("How many seconds would you like to convert?");
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        
        int hr = (amount - (amount % 3600))/3600;
        int min = ((amount%3600) - ((amount%3600)%60))/60;
        int sec = (amount%3600)%60;
        
        System.out.println("That amount of seconds would be:");
        System.out.println(hr +" hours, " + min + " minutes, and " + sec + " seconds.");
    }
}
