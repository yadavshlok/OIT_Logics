/**The distance between two cities in Km. is input through the keyboard. Write a program to
convert and print the result in meters and centimetres? */

import java.util.*;

public class Q41
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in km :");

        Double km = sc.nextDouble();

        Double m = km*1000;
        Double cm = km*100000;

        System.out.println("Distance is :"+m+"meters or "+cm+"centimetres");
    }
}