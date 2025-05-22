//Accept a character and a range n, then display the next n characters

import java.util.Scanner;

public class Q17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character : ");
        char c = sc.next().charAt(0);

        System.out.print("Enter n : ");
        int n = sc.nextInt(); 

        int i = (int)c;
        int end = i + n;
        while(i <= end)
        {
            System.out.println((char)i);
            i++;
        }
    }
}