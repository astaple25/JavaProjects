public class Time {

    public static void main(String[] args) {
      //initializes variables
      int hour = 14;
      int minute = 47;
      int second = 30;
      //makes variables for the amount of seconds in "hour" and "minute"
      int hoursinseconds = hour * 60 * 60;
      int minutesinseconds = minute * 60;
      int totalseconds = second + minutesinseconds + hoursinseconds;
      //prints seconds since midnight
      System.out.print("The amount of seconds passed since midnight is ");
      System.out.println(second + minutesinseconds + hoursinseconds + ".");
      //prints seconds left in day
      System.out.print("The amount of seconds left in the day is ");
      System.out.println(86400 - totalseconds + ".");
      //prints percentage of day passed
      double totalsecondsinday = 86400.0;
      double percentpassed = totalseconds / totalsecondsinday * 100;
      System.out.print("The percentage of the day that has passed is ");
      System.out.println(percentpassed + "%");
      //prints time since I began on this project
      int startinghour = 14;
      int startingminute = 20;
      int startingsecond = 30;
      int elapsedhour = hour - startinghour;
      int elapsedminute = minute - startingminute;
      int elaspedsecond = second - startingsecond;
      System.out.print("Time elapsed since starting is ");
      System.out.print(elapsedhour + " hours, " + elapsedminute + " minutes, ");
      System.out.println("and " + elaspedsecond + " seconds.");
      }
}
