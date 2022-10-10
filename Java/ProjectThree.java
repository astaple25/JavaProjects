/**
* Name: Adam Stapleton
* Date started: 9/21/2022
* Date completed: 9/22/2022
* Class section: 04
* Project description: Uses many methods to complete calculations and relational
*                      tests based on my birthdate.
*/
public class ProjectThree {

    public static void main(String[] args) {
        //initialize variable based on Oct. 14th, my birthday
        int bDay = 14;
        int bMonth = 10;
        //print these values out with a custom method
        printInt(bDay);
        printInt(bMonth);
        //compares and prints these values with a new method
        boolean whichLarger = largerTest(bDay, bMonth);
        //prints the difference of the two values
        int difference = numDifference(bDay, bMonth);
        //finds and prints circumference where radius is sum of bDay and bMonth
        double circ = calcCirc(bDay, bMonth);
        //finds and prints area where day is length and month is width
        double area = calcArea(bDay, bMonth);
        printDouble(area);
    }

    public static void printInt(int i) {
        /**
        * takes int, uses switch to find scenario that is being called for,
        * prints out necessary preface, and prints the int
        */
        switch (i) {
            case 4:
                System.out.print("The difference between bDay and bMonth: ");
                break;
            case 10:
                System.out.print("The month I was born: ");
                break;
            case 14:
                System.out.print("The day I was born: ");
                break;
        }
        System.out.println(i);
    }

    public static void printBoo(boolean b) {
        //takes boolean then prints preface to boolean value and the boolean
        System.out.print("Is bDay is larger than bMonth? ");
        System.out.println(b);
    }

    public static void printDouble(double d) {
        /**
        * takes double, uses if statement to determine scenario that is being
        * called for, prints out necessary preface, and prints out double
        */
        if (d > 145) {
            System.out.print("The circumference of the circle: ");
        } else {
           System.out.print("The area of the rectangle: ");
        }
        System.out.println(d);
    }

    public static boolean largerTest(int day, int month) {
        /**
        * takes day and month as int-s compares given values: if bday is larger,
        * return true, print with new method, and return that value
        */
        boolean largerFlag = day > month;
        printBoo(largerFlag);
        return largerFlag;
    }

    public static int numDifference(int day, int month) {
        /**
        * takes day and month as int-s, finds larger value between the two,
        * subtracts where the output is positive, prints the outcome of this
        * with printInt, and returns the difference
        */
        boolean larger = day > month;
        int diff;
        if (larger) {
            diff = day - month;
        } else {
            diff = month - day;
        }
        printInt(diff);
        return diff;
    }

    public static double calcCirc(int day, int month) {
        /**
        * takes day and month as int-s, adds variables given, finds
        * circumference where the sum is the radius, uses new method to print
        * and label value, and returns circumference
        */
        int radius = day + month;
        double circumference = 2 * Math.PI * radius;
        printDouble(circumference);
        return circumference;
    }

    public static double calcArea(int day, int month) {
        /**
        * takes day and month as int-s, multiplies the two values, and returns
        * as a double
        */
        double area = day * month;
        return area;
    }

}
