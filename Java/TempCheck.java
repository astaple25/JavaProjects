/**
* Name: Adam Stapleton
* Date: 9-13-2022
* Purpose: Use a random number generator to make a theoretical temperature
*          reading and respond with what humans would report as how hot or
*          cold it feels outside.
*/
import java.util.Random;

public class TempCheck {
    public static void main(String[] args) {

        Random getRandomNum = new Random();
        int randomTemp = getRandomNum.nextInt(60) + 35;
        String outsideFeel = "";

        System.out.print("\nThe high today is " + randomTemp);
        System.out.println(" degrees Fahrenheit");
        if (randomTemp >= 35 && randomTemp < 45){
            outsideFeel = "cold";
        } else if (randomTemp >= 45 && randomTemp < 55){
            outsideFeel = "chilly";
        } else if (randomTemp >= 55 && randomTemp < 65){
            outsideFeel = "cool";
        } else if (randomTemp >= 65 && randomTemp < 75){
            outsideFeel = "warm";
        } else if (randomTemp >= 75 && randomTemp < 85){
            outsideFeel = "warmer";
        } else if (randomTemp >= 85 && randomTemp <= 95){
            outsideFeel = "hot";
        }
        System.out.println("It will be " + outsideFeel + ".\n");
    }
}
