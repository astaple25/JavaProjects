import java.util.Scanner;
import java.util.Random;

public class MyDoWhile{

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random getRandomNum = new Random();
        int correctNum = getRandomNum.nextInt(20) + 1;

        boolean guessError = testInput(correctNum);

        while(guessError == true){
            guessError = testInput(correctNum);
        }

        System.out.println("You Guessed " + correctNum + ". CORRECT");

    }

    public static boolean testInput(int answer){

        Scanner keyboard = new Scanner(System.in);

        int guess = 0; //2147483647 is the max int, next num is long
        boolean err = false;

        do{

          System.out.println("Guess my number between 1 and 20: ");

          if (!keyboard.hasNextInt()){
              System.out.println("Please guess a whole number.\n");
              err = true;
              break;

          } else {

              guess = keyboard.nextInt();

              if(guess < answer){
                  System.out.println("INCORRECT. You Guessed " + guess + ". Too Low\n");
              }else if(guess > answer){
                  System.out.println("INCORRECT. You Guessed " + guess + ". Too High\n");
              }
          }

      }while(guess != answer);

      return err;

    }

}
