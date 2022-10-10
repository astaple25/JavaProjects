/**
* Name: Adam Stapleton
* Date started: 8/30/2022
* Date completed: 8/31/2022
* Class section: 04
* Project description: Solution for Lily and Vern's hypothetical pickling
*                      problem
*/
public class ProjectOne {
    public static void main(String[] args) {
        //Sets variables of user's birthdate
        double month = 10.0;
        double day = 14.0;
        double year = 2003.0;
        //Sets variables based on previous variables
        double gallons = month; //gallons available for pickling
        double cucumbers = year * 10; //cucumber harvest this year
        double cucumberSpace = day * 4; //num of cucumbers that fit in one gal
        double batchAmount = cucumberSpace * gallons; //cucumbers processed each
                                                      //batch
        double batchesNeeded = cucumbers / batchAmount;
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
