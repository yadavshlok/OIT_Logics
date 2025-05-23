//Potential Energy (PE = mgh)

import java.util.Scanner;

public class Q2
{
    public static double Potential(double m,double h)
    {
        double pe = m * 9.8 * h;
        return pe;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mass : ");
        double m = sc.nextInt();

        System.out.print("Enter height : ");
        double h = sc.nextInt();

        double pe = Potential(m,h);
        System.out.print("Potential Energy : "+pe);
    }
}