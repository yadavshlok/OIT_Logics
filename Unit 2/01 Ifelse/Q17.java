//Accept age and check whether a person is eligible for voting.

import java.util.Scanner;

public class Q17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();

        if(age > 18)
        {
            System.out.println("Person is eligible for voting");
        }
        else
        {
            System.out.println("Person is not eligible for voting");
        }
    }
}