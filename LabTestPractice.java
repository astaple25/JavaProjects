import java.util.Scanner;

public class LabTestPractice {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        char[] evenMultipliers = {'#', 'm', '^', 'o', 'k', '%', '4', '*',
                                                                      '5', 'z'};
        char[] oddMultipliers = {'j', '*', 'P', 'M', '#', 'z', '7', '@',
                                                                      '1', '%'};

        System.out.print("Give me a random number and I'll give you one way ");
        System.out.println("longer!");
        System.out.print("Enter a positive integer: ");
        int userInput = keyboard.nextInt();
        boolean evenFlag = (userInput % 2 == 0);

        if (evenFlag) {
            for (int i = 0; i < evenMultipliers.length; i++) {
                int charConversion = (int) evenMultipliers[i];
                userInput = userInput * evenMultipliers[i];
            }
        } else {
            for (int i = 0; i < oddMultipliers.length; i++) {
                int charConversion = (int) oddMultipliers[i];
                userInput = userInput * oddMultipliers[i];
            }
        }

        System.out.print("I bet this one's longer: ");
        System.out.println(userInput);

    }

}
