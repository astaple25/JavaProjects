/**
* Name: Adam Stapleton
* Date started: 11/4/2022
* Date completed: 11/4/2022
* Class section: 04
* Project description: creates an array of theorhetical prices and increases
* each by 15% then prints the outcome.
*/

public class Inflation{

    public static void main(String[] args) {

        //initializes variables needed
        double[] prices = {10.25, 5.15, 7.19, 11.27, 3.25};
        //prints the array
        System.out.println("Initial array:");
        printArray(prices);
        //increases each value in the array by 15%
        for (int i = 0; i < prices.length; i++) {
            double percentIncrease = prices[i] * 0.15;
            prices[i] += percentIncrease;
        }
        //prints the updated array
        System.out.println("Inflated array:");
        printArray(prices);

    }

    public static void printArray(double[] array){

        //method takes a double array as input and prints out each element
        //rounded to the second decimal in an array looking format
        System.out.print("{");
        for (double element : array) {
            if (element == array[array.length - 1]) {
                System.out.printf("%.2f", element);
            } else {
                System.out.printf("%.2f, ", element);
            }
        }
        System.out.println("}");

    }

}
