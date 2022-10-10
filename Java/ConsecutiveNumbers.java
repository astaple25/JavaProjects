/**
* Name: Adam Stapleton
* Date started: 9/30/2022
* Date completed: 9/30/2022
* Class section: 04
* Project description: uses a method to determine if user input numbers are
*                      consecutive.
*/
import java.util.Scanner;

public class ConsecutiveNumbers{

    public static void main(String[] args) {

      //initializes scanner and explains purpose
      Scanner keyboard = new Scanner(System.in);
      System.out.print("\nEnter three whole numbers and I will determine if ");
      System.out.println("they're consecutive!\n");

      //gets user integer input
      System.out.print("Enter a number: ");
      int num1 = keyboard.nextInt();
      System.out.print("Enter another number: ");
      int num2 = keyboard.nextInt();
      System.out.print("Enter a final number: ");
      int num3 = keyboard.nextInt();

      //checks if nums are consecutive then prints response based on boolean
      boolean result = checkConsecutive(num1, num2, num3);
      if (result == true){
          System.out.println("\nThe numbers entered are consecutive!\n");
      } else {
          System.out.println("\nThe numbers entered are not consecutive.\n");
      }

    }

    public static boolean checkConsecutive(int first, int second, int third){

        /**
        * make variables for difference and final result, compares values and
        * finds difference to check for consecutive, and returns result boolean
        */
        int diff = -1;
        boolean result = false;
        if (first < second){
            diff = second - first;
        } else {
            result = false;
        }
        if (second < third){
            if ((third - second) == diff){
                result = true;
            }
        } else {
            result = false;
        }

        return result;
    }

}
