//write a program to find the volume and surface area of cuboid

import java.util.*;

public class Q48
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        Double l = sc.nextDouble();

        System.out.print("Enter width : ");
        Double w = sc.nextDouble();

        System.out.print("Enter height : ");
        Double h = sc.nextDouble();

        Double area = 2*(w*l+h*l+w*h);
        Double vol = l*h*w;

        System.out.println("Area is : "+area);
        System.out.println("Volume is : "+vol);
    }
}