/**
* Name: Adam Stapleton
* Date started: 11/9/2022
* Date completed: 11/9/2022
* Class section: 04
* Project description: uses methods from SandCalc to calculate and print menu
* prices before and after inflation increases in ingredients' cost per pound
*/
public class SandCalcDriver {

    public static void main(String[] args) {

        //initializes variable for array length, arrays needed for calculations,
        //and constructor for SandCalc
        int numMenuItems = 7;
        String[] itemNames = {"Turkey", "Lettuce", "Avocado", "Tuna", "Peppers",
                              "Ham", "Sprouts"};
        double[] origCostPerLb = {7.55, 3.75, 8.25, 6.43, 3.15, 8.15, 4.85};
        double[] newCostPerLb = {8.25, 4.35, 9.76, 7.17, 3.85, 9.88, 5.19};
        double[] inflationPercents = new double[numMenuItems];
        double[] origMenuPrices = {1.55, 0.55, 1.25, 1.78, 0.50, 1.45, 0.45};
        double[] newMenuPrices = new double[numMenuItems];
        SandCalc calc = new SandCalc();

        //prints headers for menus and uses SandCalc methods to print
        //appropriate prices and calculate percentages of change/new menu prices
        System.out.println("\nOriginal Cost Per Pound\n");
        calc.printMenu(itemNames, origCostPerLb);
        System.out.println("\nUpdated Cost Per Pound\n");
        calc.printMenu(itemNames, newCostPerLb);
        System.out.println("\nPercentage Cost Increase\n");
        inflationPercents = calc.findIncrease(origCostPerLb, newCostPerLb);
        calc.printPercentages(itemNames, inflationPercents);
        System.out.println("\nOriginal Menu Prices\n");
        calc.printMenu(itemNames, origMenuPrices);
        System.out.println("\nAdjusted Menu Prices\n");
        newMenuPrices = calc.applyIncrease(origMenuPrices, inflationPercents);
        calc.printMenu(itemNames, newMenuPrices);
        System.out.println();

    }

}
