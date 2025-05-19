//Check whether a character is a vowel.

import java.util.Scanner;

public class Q33
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your character : ");
        char c = sc.nextLine().charAt(0);

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
        {
            System.out.println("It's a vowel");
        }
        else
        {
            System.out.println("It's Not a vowel");
        }
    }
}