/*Accept product category and apply a discount based on category:
    o Electronics → 10% discount
    o Clothing → 15% discount, 20% if amount > ₹5000
    o Food → No discount, but 5% if amount > ₹1000 */

import java.util.Scanner;

public class Q42
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product category (1 for Electronics,2 for Clothing,3 for Food): ");
        int c = sc.nextInt();
        System.out.print("Enter the amount : ");
        double a = sc.nextDouble();
        double d = 0;

        if(c == 1)
        {
            d = 0.10 * a;
        }
        else if(c == 2)
        {
            d = 0.15 * a;
            if(a > 5000)
            {
                d = 0.20 * a; 
            }
        }
        else if(c == 3)
        {
            if(a > 1000)
            {
                d = 0.05 * a; 
            }
        }

        double fa = a - d;
        System.out.println("Discount : " + d);
        System.out.println("Final amount after discount : " + fa);

    }
}