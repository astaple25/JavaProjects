/**
* Name: Adam Stapleton
* Date started: 9/26/2022
* Date finished: 9/26/2022
* Section: 04
* Purpose: A program that takes intructs user on how to write a haiku and takes
*          user input to make the final poem.
*/
import java.util.Scanner;

public class HaikuLab{

    public static void main(String[] args) {

      //intructs user how to make haiku while taking user input along the way
      System.out.println("Make your own haiku!\n");
      System.out.print("Enter a line that has five syllables: ");
      String line1 = getLine();
      System.out.print("Enter the next line with seven syllables: ");
      String line2 = getLine();
      System.out.print("Enter final line with five syllables: ");
      String line3 = getLine();

      //prints out the final haiku and a remark on its beauty
      System.out.println("\nHere is your haiku!\n");
      System.out.println(line1);
      System.out.println(line2);
      System.out.println(line3);
      System.out.println("\nWow, that was beautiful.");

    }

    public static String getLine(){

        //initializes scanner, takes user String input, and returns said input
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        return input;

    }

}
