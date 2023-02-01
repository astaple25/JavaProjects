/**
* Name: Adam Stapleton
* Date started: 11/1/2022
* Date completed: 11/1/2022
* Class section: 04
* Project description: fills an array with 100 random integers between 1-100 and
* prompts user to guess a number then finds that number's index or says its not
* there.
*/
import java.util.Scanner;
import java.util.Random;

public class ArraySearch {

    public static void main(String[] args) {

        //initializes needed variables
        Scanner keyboard = new Scanner(System.in);
        Random getRandomNumber = new Random();
        int[] randomArray = new int[100];
        int numFoundIndex = 0;
        boolean numFound = false;
        //fills the array with random numbers between 1 and 100
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = getRandomNumber.nextInt(100) + 1;
        }

        //explains program and prompts user for a number between 1 and 100
        System.out.print("Guess a number between 1 and 100 and I'll check if ");
        System.out.println("its in the array of 100\nrandom numbers.");
        System.out.print("Enter your guess here: ");
        //input validation
        while (!keyboard.hasNextInt()){
            String word = keyboard.next();
            System.err.println(word + " is not a whole number.");
            System.out.print("Enter your guess here: ");
        }
        int userGuess = keyboard.nextInt();
        //loops through array to find first occurance of number, if any, and
        //records the index of that number
        for (int i = 0; i < randomArray.length; i++){
            if (randomArray[i] == userGuess && !numFound){
                numFound = true;
                numFoundIndex = i;
            }
        }

        //if the guess is in the array, print the index of the first occurance
        //of the number. if not, print comment on the odds.
        if (numFound){
            System.out.print("The first found index of " + userGuess + " is ");
            System.out.println(numFoundIndex + ".");
        } else {
            System.out.print("Well, despite the odds in your favor, ");
            System.out.println(userGuess + " is not in the array.");
        }

    }

}
