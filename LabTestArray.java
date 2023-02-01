import java.util.Scanner;

public class LabTestArray{

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int[] positiveMultiples = {1, 0, 2, 0, 3, 0, 4, 0, 5, 0};
        int[] negativeMultiples = {0, 1, 0, 2, 0, 3, 0, 4, 0, 5};
        int[] products = new int[10];
        System.out.print("Give me a positive integer and I'll multiply it by ");
        System.out.println("my mystery numbers!");
        System.out.print("Enter a positive integer: ");
        int userInput = keyboard.nextInt();

        if (userInput % 2 == 0) {
            System.out.print("{");
            for (int i = 0; i < positiveMultiples.length; i++) {
                products[i] = userInput * positiveMultiples[i];
                if (i == positiveMultiples.length - 1) {
                    System.out.print(products[i]);
                } else {
                    System.out.print(products[i] + ", ");
                }
            }
            System.out.println("}");
        } else {
          System.out.print("{");
          for (int i = 0; i < negativeMultiples.length; i++) {
              products[i] = userInput * negativeMultiples[i];
              if (i == negativeMultiples.length - 1) {
                  System.out.print(products[i]);
              } else {
                  System.out.print(products[i] + ", ");
              }
          }
          System.out.println("}");
        }

        System.out.println("How's that for magic transformations?");
    }

}
