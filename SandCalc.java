/**
* Name: Adam Stapleton
* Date started: 11/9/2022
* Date completed: 11/9/2022
* Class section: 04
* Project description: (FOR EXTERNAL USE) methods used for calculating inflation
* in products and applying that to a set of numbers as well as printing arrays
* in menu format
*/
public class SandCalc {

    public static void printMenu(String[] itemNames, double[] prices){

        //this method iterates each loop to print the item name and price in a
        //menu format
        for (int i = 0; i < itemNames.length; i++){
            System.out.printf("%s: $%.2f\n", itemNames[i], prices[i]);
        }

    }

    public static void printPercentages(String[] itemNames, double[]
                                                                   percentages){

        //this method iterates each loop to print the item name and the
        //percentage increase for that item in a menu format
        for (int i = 0; i < itemNames.length; i++){
            System.out.printf("%s: %.0f", itemNames[i], percentages[i]);
            System.out.println("%");
        }

    }

    public static double[] findIncrease(double[] initialPrices, double[]
                                                                     newPrices){

        //this method iterates both loops to find the percentage change between
        //the old and new prices
        double[] inflationPercents = new double[initialPrices.length];
        for (int i = 0; i < initialPrices.length; i++){
            double priceIncrease = newPrices[i] - initialPrices[i];
            inflationPercents[i] = (priceIncrease / initialPrices[i]) * 100;
        }
        return inflationPercents;

    }

    public static double[] applyIncrease(double[] prices, double[]
                                                               percentIncrease){

        //this method iterates both loops to apply the percentage increase to
        //the menu prices
        for (int i = 0; i < prices.length; i++) {
            percentIncrease[i] = percentIncrease[i] / 100;
            prices[i] += prices[i] * percentIncrease[i];
        }
        return prices;

    }

}
