//Accept 10th, 12th, and graduation marks, then check eligibility for an interview

import java.util.Scanner;

public class Q31
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of 10th (in per) : ");
        int ten = sc.nextInt();

        System.out.print("Enter marks of 12th (in per) : ");
        int twel = sc.nextInt();

        System.out.print("Enter marks of Graduation (cgpa) : ");
        int grad = sc.nextInt();

        if(ten >= 60 && twel >= 60 && grad >= 6)
        {
            System.out.println("Eligible for interview");
        }
        else
        {
            System.out.println("Not eligible for interview");
        }
    }
}