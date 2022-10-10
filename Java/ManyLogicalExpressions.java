/**
* Name: Adam Stapleton
* Date: 9/13/2022
* Purpose: This program completes exercise 4 in chapter 5 of ThinkJava by
*          testing many different logical expressions.
*/
public class ManyLogicalExpressions{
    public static void main(String[] args){

        boolean yes = true;
        boolean no = false;
        int loVal = -999;
        int hiVal = 999;
        double grade = 87.5;
        double amount = 50.0;
        String hello = "world";

        boolean test = (yes == no || grade > amount); //true
        System.out.println(test);
        //test = (amount == 40.0 || 50.0); error/skipped
        //System.out.println(test);
        test = (hiVal != loVal || loVal < 0); //true
        System.out.println(test);
        //test = (True || hello.length() > 0); error/skipped
        //System.out.println(test);
        test = (hello.isEmpty() && yes); //false
        System.out.println(test);
        test = (grade <= 100 && !false); //true
        System.out.println(test);
        test = (!yes || no); //false
        System.out.println(test);
        //test = (grade > 75 amount); error/skipped
        //System.out.println(test);
        test = (amount <= hiVal && amount >= loVal); //true
        System.out.println(test);
        test = (no && !no || yes && !yes); //false
        System.out.println(test);
    }
}
