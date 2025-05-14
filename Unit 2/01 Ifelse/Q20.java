/*Accept ATM balance and withdrawal amount, then check sufficient balance and display the
remaining balance.*/

import java.util.Scanner;

public class Q20
{
    public static void main(String[] args)
    {
        int bal = 7232;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw : ");
        int w = sc.nextInt();

        if( w <= bal)
        {
            System.out.println("\nAmount withdraw successfully");
            System.out.println("Remaining balance is : "+(bal-w));
        }
        else
        {
            System.out.println("\nNot enough balance");
            System.out.println("Balance amount is : "+bal);
        }
    }
}