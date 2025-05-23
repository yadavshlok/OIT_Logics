//Momentum (P = mv)

import java.util.Scanner;

public class Q3
{
    public static double Momentum(double m,double v)
    {
        double mtm = m * v;
        return mtm;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mass : ");
        double m = sc.nextInt();

        System.out.print("Enter velocity : ");
        double v = sc.nextInt();

        double mtm = Momentum(m,v);
        System.out.print("Momentum : "+mtm);
    }
}