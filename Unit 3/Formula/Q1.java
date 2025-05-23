//Kinetic Energy (KE = ½mv²)

import java.util.Scanner;

public class Q1
{
    public static double Kinetic(double m,double v)
    {
        double ke = 0.5 * m * v * v;
        return ke;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mass : ");
        double m = sc.nextInt();

        System.out.print("Enter velocity : ");
        double v = sc.nextInt();

        double ke = Kinetic(m,v);
        System.out.print("Kinetic Energy : "+ke);
    }
}