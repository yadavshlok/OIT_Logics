//Check whether a character is an alphabet or not.

import java.util.Scanner;

public class Q34
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character : ");
        char c = sc.next().charAt(0);

        if(Character.isAlphabetic(c))
        {
            System.out.println("Is alphabet");
        }
        else
        {
            System.out.println("Is Not alphabet");
        }
    }
}