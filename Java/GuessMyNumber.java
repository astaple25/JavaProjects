/**
* Name: Adam Stapleton
* Date: 9/12/2022
* Purpose: This program pulls a random number and allows the user to guess the
*          number.
*/
import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber{
    public static void main(String[] args){

        Random getRandomNum = new Random();
        Scanner in = new Scanner(System.in);
        int randomNumber = getRandomNum.nextInt(10) + 1;
        int difference;

        System.out.println("\nTry to guess my number!");
        System.out.print("Guess a whole number between 1 and 10: ");
        int guess = in.nextInt();
        System.out.println("\nSo you guessed " + guess + "?");
        System.out.println("The number was " + randomNumber + ".");

        if (guess > 0 && guess <= 10){
            if (guess == randomNumber){
                System.out.println("Wow, you got it!\n");
            } else if (guess > randomNumber){
                difference = guess - randomNumber;
                System.out.println("You were " + difference + " away.\n");
            } else if (guess < randomNumber){
                difference = randomNumber - guess;
                System.out.println("You were " + difference + " away.\n");
            }
        } else {
            System.out.println("Your number is not between 1 and 10.\n");
        }
    }
}
