
/**
 * Shreyas Yerabati
 * 8/15/22
 * Project 2.8
 * To show the use of the math class for pow and sqrt
 * 
 * Variable List:
 *  num1a = base of the number
 *  num2 = power that the base is raised to
 *  num1 = the number that we will find the sqrt of
 */
import java.util.*;
public class Project2_8
{
   public static void main(String[]args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the first x coordinate:");
       int x1 = scan.nextInt();
       
       System.out.println("Enter the first y coordinate:");
       int y1 = scan.nextInt();
        
       System.out.println("Enter the second x coordinate:");
       int x2 = scan.nextInt();
       
       System.out.println("Enter the second y coordinate:");
       int y2 = scan.nextInt();
       
       double distance = Math.sqrt( (Math.pow((x2-x1),2) + Math.pow((y2-y1),2)) );
       
       System.out.println();
       System.out.println("The distance between the two coordinates is " + distance);
        }
}
