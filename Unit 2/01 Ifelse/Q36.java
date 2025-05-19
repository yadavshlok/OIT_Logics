
//Check whether a character is a digit or not.

import java.util.Scanner;

public class Q36
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character : ");
        char c = sc.next().charAt(0);

        if(Character.isDigit(c))
        {
            System.out.println("Is digit");
        }
        else
        {
            System.out.println("Is Not digit");
        }
    }
}