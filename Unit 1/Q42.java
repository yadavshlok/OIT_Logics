// Write a program which accepts the amount in dollars and convert into rupees?

import java.util.*;

public class Q42
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount : ");

        Double dl = sc.nextDouble();

        Double rs = dl*85.21;

        System.out.println(dl+"$ = "+rs+"rs.");

    }
}