//Accept number of vaccines taken, if 2 vaccines then print eligible for interview.

import java.util.Scanner;

public class Q19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vaccines taken : ");
        int vac = sc.nextInt();

        if(vac >= 2)
        {
            System.out.println("Eligible for interview");
        }
        else
        {
            System.out.println("Not eligible for interview");
        }
    }
}