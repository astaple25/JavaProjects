/**
* Program calculating cubic volume using length, width, and height
* Adam Stapleton, ITEC 118, Section 04
* Version 1.0
*/

public class CubicVolume{
  public static void main(String[] args){

    int length = 5; //length = 5 units
    int width = 7;  //width  = 7 units
    int height = 9; //height = 9 units

    //calculates the cubic volume by multiplying length times width times height
    int cubeVolume = length * width * height;

    //prints out the total cubic volume
    System.out.println("The total cubic volume is " + cubeVolume + ".");
  }
}
