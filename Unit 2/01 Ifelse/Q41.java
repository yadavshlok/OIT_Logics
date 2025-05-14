/*Accept weekday/weekend & age, then calculate movie ticket pricing:
    o Children (<13 years) → ₹100 (Weekdays), ₹120 (Weekends)
    o Adults (13-64 years) → ₹150 (Weekdays), ₹180 (Weekends)
    o Seniors (≥65 years) → ₹130 (Weekdays), ₹150 (Weekends)*/

import java.util.Scanner;

public class Q41
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter the day (1 for weekday, 2 for weekend) : ");
        int day = sc.nextInt();
        int ticketPrice = 0;

        if (age < 13)
        {
            ticketPrice = (day == 1)? 100 : 120;
        }
        else if (age >= 13 && age < 65)
        {
            ticketPrice = (day == 1)? 150 : 180;
        }
        else
        {
            ticketPrice = (day == 1)? 130 : 150;
        }

        System.out.println("Your ticket price is : Rs." + ticketPrice);
    }
}