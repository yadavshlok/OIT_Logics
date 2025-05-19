//Check whether a character is a special character.

import java.util.Scanner;

public class Q37
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character : ");
        char c = sc.next().charAt(0);

        if(Character.isAlphabetic(c) || Character.isDigit(c))
        {
            System.out.println("Is Not Special character");
        }
        else
        {
            System.out.println("Is Special character");
        }
    }
}