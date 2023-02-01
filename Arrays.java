/**
* Name: Adam Stapleton
* Date started: 11/8/2022
* Date completed: 11/8/2022
* Class section: 04
* Project description: (FOR EXTERNAL USE) takes an array and prints the values
* in array initialization form
*/
public class Arrays {

    public static void printArray(int[] array){

        //method takes an int array as input and prints out each element
        //in an array looking format
        System.out.print("{");
        for (int element : array) {
            if (element == array[array.length - 1]) {
                System.out.print(element);
            } else {
                System.out.printf(element + ", ");
            }
        }
        System.out.println("}");

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
