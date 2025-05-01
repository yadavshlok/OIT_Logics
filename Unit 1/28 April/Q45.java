//write a program to find the surface area of cylinder

import java.util.*;

public class Q45
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius :");
        Double r = sc.nextDouble();
        
        System.out.print("Enter height :");
        Double h = sc.nextDouble();

        Double area = 2*3.14*r*h+2*3.14*r*r;

        System.out.println("Surface area of cylinder : "+area);
    }
}