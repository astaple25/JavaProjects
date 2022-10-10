import java.util.Scanner;
import java.util.Random;

public class Do_While{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    //Random random = new Random();

    int numberGuess = 0;
    int k = 17;
    //boolean j = false;


    //System.out.println(numberGuess);

    do{
      System.out.println("Guess my number between 1 and 20: ");
      numberGuess = keyboard.nextInt();
      //numberGuess = 0;
     if (keyboard.hasNextInt() == true){


        if(numberGuess < k)
          System.out.println("INCORRECT. You Guessed " + numberGuess + ". Too Low\n");
          //System.out.println("Guess my number between 1 and 20: ");
          //numberGuess = keyboard.nextInt();
        if(numberGuess > k)
          System.out.println("INCORRECT. You Guessed " + numberGuess+ ". Too High\n");
          //System.out.println("Guess my number between 1 and 20: ");
          //numberGuess = keyboard.nextInt();
      }else{
        System.out.println("Needs to be Whole number");
        //System.out.println("Guess my number between 1 and 20: ");
        //numberGuess = keyboard.nextInt();
        //j = true;
        //break;
      }


    } while(numberGuess != k);

    System.out.println("You Guessed " + k + ". CORRECT");



  }
}
