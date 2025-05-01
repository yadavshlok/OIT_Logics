// write a program to find the area and perimeter of the ring

import java.util.*;

public class Q47
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Outer radius : ");
        Double or = sc.nextDouble();

        System.out.print("Enter Inner radius : ");
        Double ir = sc.nextDouble();

        Double area = (3.14*or*or) - (3.14*ir*ir);
        Double circm = (2*3.14*or) + (2*3.14*ir);

        System.out.println("Area is : "+area);
        System.out.println("Circumference is : "+circm);
    }
}
