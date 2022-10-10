/**
* Name: Adam Stapleton
* Class: ITEC 118
* Section: 04
* Date: 9/9/22
*
* This program generates a random number and then uses the remainder operator
*/

//imports the random program
import java.util.Random;

public class EvenOrOdd {

    public static void main(String[] args){

        //creates an instance of Random()
        Random generateRandomNum = new Random();

        //declares and initializes the random number and flag testing even or odd
        int randomNumber = generateRandomNum.nextInt(100) + 1;
        boolean evenFlag = (randomNumber % 2 == 0);

        //prints the random number chosen
        System.out.println("\nOur number chosen today is " + randomNumber + ".");
        //tests for even or odd in the new random number and prints appropriately
        if (evenFlag) {
            System.out.println(randomNumber + " is even!\n");
        } else {
            System.out.println(randomNumber + " is odd!\n");
        }

    }
}
