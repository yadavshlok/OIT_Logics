//Write a program to find the area and perimeter of a square?

import java.util.*;

public class Q13 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of side : ");
        int s=sc.nextInt();
        int p=4*s;

        System.out.print("The perimeter of square is "+p);
    }
}