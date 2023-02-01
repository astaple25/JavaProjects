import java.util.Scanner;

public class LabTestInt{

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int[] positiveMultiples = {1, 0, 2, 0, 3, 0, 4, 0, 5, 0};
        int[] negativeMultiples = {0, 1, 0, 2, 0, 3, 0, 4, 0, 5};
        System.out.print("Give me a positive integer and I'll multiply it by ");
        System.out.println("my mystery numbers!");
        System.out.print("Enter a positive integer: ");
        int userInput = keyboard.nextInt();

        if (userInput % 2 == 0) {
            for (int i = 0; i < positiveMultiples.length; i++) {
                userInput = userInput * positiveMultiples[i];
            }
        } else {
            for (int i = 0; i < negativeMultiples.length; i++) {
                userInput = userInput * negativeMultiples[i];
            }
        }

        System.out.println("Your new number is " + userInput + "!");
        System.out.println("How's that for magic transformations?");
    }

}
