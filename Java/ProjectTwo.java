/**
* Name: Adam Stapleton
* Date started: 9/14/2022
* Date completed: 9/15/2022
* Class section: 04
* Project description: Generates an wardrobe advice based on a theorhetical
*                      weather forecast.
*/
//imports the utility for generating random numbers
import java.util.Random;

public class ProjectTwo {
    public static void main(String[] args) {

        //makes instance of class Random
        Random getRandomNum = new Random();

        //initializes variables for temperature and precipitation chance
        int randomTemp = getRandomNum.nextInt(60) + 35; //generates number
                                                        //between 35 and 95
        int randomPrecip = getRandomNum.nextInt(100) + 1; //generates number
                                                          //between 1 and 100
        //initializes variables for the forecast terms and clothing items
        String outsideFeel = "";
        String cloudCover = "";
        String top = "";
        String bottom = "";
        String outerWear = "";

        //prints out the values chosen for temperature and precipitation chance
        System.out.print("\nThe high for today's forecast is " + randomTemp);
        System.out.println(" degrees Fahrenheit.");
        System.out.print("The chance of precipitation in the area is ");
        System.out.println(randomPrecip + " percent.");

        /*
        * First conditional statement, assigns term for outsideFeel forecast,
        * top, and bottom based on the random temperature decided.
        **/
        if (randomTemp >= 35 && randomTemp < 45){
            outsideFeel = "cold";
            top = "sweater";
            bottom = "fleece pants";
        } else if (randomTemp >= 45 && randomTemp < 55){
            outsideFeel = "chilly";
            top = "flannel";
            bottom = "jeans";
        } else if (randomTemp >= 55 && randomTemp < 65){
            outsideFeel = "cool";
            top = "long-sleeve shirt";
            bottom = "skinny jeans";
        } else if (randomTemp >= 65 && randomTemp < 75){
            outsideFeel = "warm";
            top = "polo";
            bottom = "khaki shorts";
        } else if (randomTemp >= 75 && randomTemp < 85){
            outsideFeel = "warmer";
            top = "t-shirt";
            bottom = "athletic shorts";
        } else if (randomTemp >= 85 && randomTemp <= 95){
            outsideFeel = "hot";
            top = "tank-top";
            bottom = "booty shorts";
        }

        /*
        * Second conditional statement, assigns term for cloudCover forecast
        * and outerWear based on the random precipitation chance decided.
        * (newlines are used to ensure good readability)
        **/
        if (randomPrecip <= 10){
            cloudCover = "clear skies";
            outerWear = "\nand a hat";
        } else if (randomPrecip > 10 && randomPrecip <= 30){
            cloudCover = "cloudy skies";
            //outerWear is not assigned for cloudy because you don't need
            //anything special for cloudy days.
        } else if (randomPrecip > 30 && randomPrecip <= 50){
            cloudCover = "scattered showers";
            outerWear = "\nand a light jacket";
        } else if (randomPrecip > 50 && randomPrecip <= 70){
            cloudCover = "rain";
            outerWear = "\nand a rain jacket";
        } else if (randomPrecip > 70 && randomPrecip <= 90){
            cloudCover = "heavy rain";
            outerWear = "\nand a rain jacket with an umbrella";
        } else if (randomPrecip > 90){
            cloudCover = "massive downpours";
            outerWear = "\nand limit time outdoors due to rain";
        }

        //prints out forecast terms and wardrobe suggestions assigned earlier
        System.out.print("When you step outside today, the weather will be ");
        System.out.println(outsideFeel + " with " + cloudCover + ".");
        System.out.print("It would be a good idea to wear a " + top + " with ");
        System.out.println(bottom + outerWear + ".");
        System.out.print("This has been your weather report with ");
        System.out.println("meteorologist Adam Stapleton.\n");
    }
}
