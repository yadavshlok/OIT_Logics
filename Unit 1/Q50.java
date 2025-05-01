//Write a programme to accept a Number from user and display its ascii value

import java.util.*;

public class Q50
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        char ch = sc.next().charAt(0);

        System.out.println("Ascii value of "+ch+" is "+(int)ch);
    }
}
