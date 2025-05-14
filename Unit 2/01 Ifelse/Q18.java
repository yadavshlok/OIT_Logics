//Accept ATM pin number (1234) and check whether it is valid or not.

import java.util.Scanner;

public class Q18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ATM pin : ");
        int pin = sc.nextInt();

        if(pin == 1234)
        {
            System.out.println("Device accessed successfully");
        }
        else
        {
            System.out.println("Try again");
        }
    }
}