/**
* Name: Adam Stapleton
* Date started: 1/19/2023
* Date completed: 1/25/2023
* Class section: 01
* Project description: Finds vowels in a string and returns the number found and
* a list of the vowels.
*/
import java.util.Scanner;

public class SpringProjectOne{
    public static void main(String[] args) {
        
        //initialize varibles needed for comparison and input
        Scanner keyboard = new Scanner(System.in);
        String vowels = "aeiou";
        String foundVowels = "";
        int numVowels = 0;

        //prompt for input from the user
        System.out.println("Enter a string and I will find the vowels!");
        System.out.print("Type your sentence here (type \"quit\" to quit): ");
        String userInput = keyboard.nextLine();
        String userInputLower = userInput.toLowerCase();

        //loop until user quits
        while (!userInputLower.equals("quit")) {
            //nested loop for comparing input to find vowels
            for (int x = 0; x < userInputLower.length(); x++){
                for (int y = 0; y < vowels.length(); y++){
                    //increments variable if vowel is found
                    if (userInputLower.charAt(x) == vowels.charAt(y)){
                        foundVowels += userInputLower.charAt(x);
                        numVowels += 1;
                    }
                }
            }
            //response with vowel count and ones found
            if (numVowels > 0){
                System.out.print("\nI found " + numVowels + " vowels in your ");
                System.out.println("sentence:");
                System.out.println(userInput);
                System.out.println("Vowels found: " + foundVowels + "\n");
            } else {
                //response with no vowels
                System.out.println("\nI found zero vowels in your sentence.");
                System.out.println("Wait, how? Nevermind.\n");
            }
            //reset variables for next iteration and prompt for new input
            foundVowels = "";
            numVowels = 0;
            System.out.print("Type your next sentence here (type \"quit\" ");
            System.out.print("to quit): ");
            userInput = keyboard.nextLine();
            userInputLower = userInput.toLowerCase();
        }
        //exit print
        System.out.println("Thanks for playing! Bye bye!");
    }
}