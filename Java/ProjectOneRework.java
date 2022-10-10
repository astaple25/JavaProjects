/**
* Name: Adam Stapleton
* Date started:9/21/2022
* Date completed: 9/21/2022
* Class section: 04
* Project description: Solution for Lily and Vern's hypothetical pickling
*                      problem reworked with methods
*/
public class ProjectOneRework {

    //method for calculating total number of cucumbers
    public static double cucumberCalc(double year){
        double cuc = year * 10;
        return cuc;
    }

    //method for finding how many cucumbers can fit in one gallon
    public static double cucumberPerGallon(double day){
        double space = day * 4;
        return space;
    }

    //method for finding how many pickles can be processed in one batch
    public static double cucumberPerBatch(double space, double gal){
        double batch = space * gal;
        return batch;
    }

    //method for finding the final number of batches needed this season.
    public static double batchesCalc(double cucs, double batches){
        double amount = cucs / batches;
        return amount;
    }

    //main method
    public static void main(String[] args) {
        //Sets variables based on birthdate using new methods.
        double gallons = 10.0;
        double cucumbers = cucumberCalc(2003); //cucumber harvest this year
        double cucumberSpace = cucumberPerGallon(14); //num of cucumbers that
                                                      //fit in one gal
        double batchAmount = cucumberPerBatch(cucumberSpace, gallons);
                                              //^^cucumbers processed each batch
        double batchesNeeded = batchesCalc(cucumbers, batchAmount);
        /**
        * Note that in the following section, the \n escape sequence is used to
        * clean up the output and make the code easy to read no matter what tool
        * is used to compile and run the code.
        */
        //Prints appropriate information about pickling
        System.out.println("\nThe size of the pot is " + gallons + " gallons");
        System.out.println("This year's yield of cucumbers is " + cucumbers);
        System.out.print("Your cucumber size allows for " + cucumberSpace);
        System.out.println(" cucumbers per gallon");
        System.out.print("Your pot can make " + batchAmount + " pickles per ");
        System.out.println("batch");
        System.out.print("In order to convert all cucumbers into pickles, ");
        System.out.println(batchesNeeded + " batches will\nneed to be done\n");

        //Prints final message to Lily and Vern
        System.out.println("Dear Lily and Vern,\n");
        System.out.print("The numbers are in. I have calculated the number of");
        System.out.print(" batches needed this season\nby finding how many ");
        System.out.print("of this year's cucumbers can fit in the pot then ");
        System.out.print("dividing\nthis year's yield by that amount. Your ");
        System.out.print("total number of batches needed is\n" + batchesNeeded);
        System.out.print(". I hope this information will help you in ");
        System.out.println("continued profit\nduring the offseason.");
        System.out.println("\nMuch love,\nAdam Stapleton\n");
    }
}
