
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
       System.out.println("Do you want to use the operator [1] Power or [2] Sqrt");
       Scanner scan = new Scanner(System.in);
       int choice = scan.nextInt();
       if (choice == 1) {
           
           System.out.println("Enter the base:");
           double num1a = scan.nextDouble();
           System.out.println("Enter the power:");
           double num2 = scan.nextDouble();
           System.out.println();
           System.out.println("The result is "+(Math.pow(num1a, num2)) + ".");
           
       }
       else if (choice == 2){
        System.out.println("Enter the number");
        double num1 = scan.nextDouble();
        System.out.println();
        System.out.println("The Square Root of " + num1 + " is " + (Math.sqrt(num1) + "."));
        
        }
        else {
            System.out.println("ERROR! The choices were only between 1 and 2...");
            
        }
        
        }
}
