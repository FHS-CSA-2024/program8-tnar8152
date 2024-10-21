
/**
 * Write a description of class ProgramTn8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ProgramTn8
{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2:");
        int num2 = scanner.nextInt();
        //Original numbers are 13 and 20
        System.out.println("Original numbers are " + num1 + " and " + num2);
        int sum = num1 + num2;
        System.out.println("Sum = " + sum );
        int difference = num1 - num2;
        System.out.println("Difference = " + difference);
        int product = num1 * num2;
        System.out.println("Product = " + product);
        double average = (double)(num1 + num2)/2;
        System.out.println("Average = " + average);
        int absoluteValue = Math.abs(num1 - num2);
        System.out.println("Absolute value = " + absoluteValue);
        int max;
        if (num1 > num2){
            max= num1;
        } else {
            max=num2;
        }
        System.out.println("Maximum = " + max);
        int min;
        if (num1<num2){
            min = num1;
    
        } else {
            min= num2 ;
        }
        
        System.out.println("Minimum = " + min);
  }
}
