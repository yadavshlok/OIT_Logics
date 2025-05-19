//Check whether a character is uppercase, lowercase, or something else.

import java.util.Scanner;

public class Q35
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character : ");
        char c = sc.nextLine().charAt(0);

        if(Character.isUpperCase(c))
        {
            System.out.println("Character is Uppercased");
        }
        else if(Character.isLowerCase(c))
        {
            System.out.println("Character is Lowercased");
        }
        else
        {
            System.out.println("Something else");
        }
    }
}