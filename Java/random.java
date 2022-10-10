/**
* this is an example that uses the package java.util.random
* to generate a random number
*/

import java.util.Random;

public class dice {

  public static void main (String[] args){

    Random randomNumber = new Random();

    int result;

    result = randomNumber.nextInt(100) + 1;

    System.out.println(result);

  }
}
