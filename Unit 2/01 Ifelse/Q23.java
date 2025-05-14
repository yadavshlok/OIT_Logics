//Accept two points (x, y) and determine which quadrant they belong to.

import java.util.Scanner;

public class Q23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();

        System.out.print("Enter y : ");
        int y = sc.nextInt();

        if(x > 0 && y > 0)
        {
            System.out.println("First Quadrant");
        }
        else if(x < 0 && y > 0)
        {
            System.out.println("Second Quadrant");
        }
        else if(x < 0 && y < 0)
        {
            System.out.println("Third Quadrant");
        }
        else
        {
            System.out.println("Fourth Quadrant");
        }
    }
}