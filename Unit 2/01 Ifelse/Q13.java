//Accept amount and apply discount based on the amount range.

import java.util.Scanner;

public class Q13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount : ");
        double amt = sc.nextDouble();

        System.out.print("Enter Discount (in %) : ");
        double dis = sc.nextDouble();

        double disamt = amt * (dis/100);
        System.out.println("Price after discount : "+(amt-disamt));
    }
}